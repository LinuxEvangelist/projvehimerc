/*!
 * jQuery TubePlayer Plugin
 * 
 * version: 1.0.0 (13-FEB-2011)
 * @requires v1.3.2 or later
 * @requires SWFObject - http://code.google.com/p/swfobject/
 *	- even if using HTML5/iframe player, when unsupported will use flash based player
 * 
 * Documentation:
 * 		http://www.tikku.com/jquery-youtube-tubeplayer-plugin
 *
 * Copyright 2011, Nirvana Tikku (@ntikku / ntikku@gmail.com)
 * 
 * Dual licensed under the MIT and GPL licenses:
 *   http://www.opensource.org/licenses/mit-license.php
 *   http://www.gnu.org/licenses/gpl.html 
 */
;(function($){
	
	var TUBEPLAYER = ".tubeplayer",
		TUBE_PLAYER_CLASS = "-youtube-tubeplayer-",
		OPTS = "opts"+TUBEPLAYER;
		
	// private caches of player instances
	var players = []; // all the players ID's
	var ytplayers = {}; // all the iframe players
	
	// public facing defaults
	$.tubeplayer = {};
	
	/**
	 * These are all the events that are bound to the YouTube Player
	 * the events can be overridden as they are public.
	 * 
	 * There are several functions that serve as wrappers to be utilized
	 * internally - stateChange, onError, qualityChange. Change them at your 
	 * own risk.
	 */
	$.tubeplayer.defaults = {
	
		afterReady: function($player){},
		
		stateChange: function(player){
			var _this = this;
			var _ret = _this.onPlayer;
			return function(state){
				if(typeof(state)=="object")state = state.data;
				switch(state){
					case -1: return _ret.unstarted[player]();
					case 0: return _ret.ended[player]();
					case 1: return _ret.playing[player]();
					case 2: return _ret.paused[player]();
					case 3: return _ret.buffering[player]();
					case 5: return _ret.cued[player]();
					default: return null;
				}
			}
		},
		
		onError: function(player){
			var _this = this;
			var _ret = _this.onErr;
			return function(errorCode){
				if(typeof(errorCode)=="object")errorCode = errorCode.data;
				switch(errorCode){
					case 100: case 150: return _ret.notFound[player]();
					case 101: return _ret.notEmbeddable[player]();
					default: return null;
				}
			}
		},
		
		qualityChange: function(player){
			var _this = this;
			return function(suggested){
				if(typeof(suggested)=="object")suggested = suggested.data;
				return _this.onQualityChange[player](suggested);
			}
		},
		
		onQualityChange:{},
		
		onPlayer:{unstarted:{},ended:{},playing:{},paused:{},buffering:{},cued:{}},
		
		onErr:{notFound:{},notEmbeddable:{}}
		
	};
	
	/**
	 * These are the internal defaults for the TubePlayer
	 * plugin to work without providing any parameters. They
	 * are merged with the users options.
	 */
	var defaults = {
	
		// imperitive but not public facing
		allowScriptAccess: "always",
		
		// public facing
		width: 425,
		height: 355,
		allowFullScreen: "true",
		initialVideo: "DkoeNLuMbcI",
		playerID: "youtube-player",
		preferredQuality: "default",
		
		// html5 specific attrs
		iframed: true,
		autoplay: 0,
		showcontrols: 1,
		
		
		// trigger fn's
		onPlay: function(id){},
		onPause: function(){},
		onStop: function(){},
		onSeek: function(time){},
		onMute: function(){},
		onUnMute: function(){},
		
		// player fn's
		onPlayerUnstarted: function(){},
		onPlayerEnded: function(){},
		onPlayerPlaying: function(){},
		onPlayerPaused: function(){},
		onPlayerBuffering: function(){},
		onPlayerCued: function(){},
		onQualityChange: function(){},
		
		// error fn's
		onErrorNotFound: function(){},
		onErrorNotEmbeddable: function(){}
		
	};
	
	/**
	 * The TubePlayer plugin bound to the jQuery object's prototype. 
	 * This method acts as an interface to instantiate a TubePlayer, 
	 * as well as invoke events that are attached - typically getters/setters
	 */
	$.fn.tubeplayer = function(input, xtra){
		var $this = $(this);
		var type = typeof input;
		if(arguments.length == 0 || type == "object")
			return init($this, input);
		else if(type == "string")
			return $this.triggerHandler(input+TUBEPLAYER, xtra||null);
	};
	
	
	/**
	 * Initialize a YouTube player; 
	 *
	 *	First check to see if TubePlayer has been init'd
	 *	if it has then return, otherwise:
	 *		> add the tubeplayer class (used to denote a player)
	 *		> provide local data access to the options and store it
	 *		> initialize the default events on the jQuery instance
	 *		> create the container for the player
	 *		> initialize the player (iframe/HTML5 vs flash based)
	 * 
	 *	@param $player - the instance being created on
	 *	@param defaults - these are the defaults within the TubePlayer options
	 *	@param opts - the user's options
	 */
	function init($player, opts){
	
		var o = $.extend({}, defaults, opts);
		
		if($player.hasClass(TUBE_PLAYER_CLASS))
			return $player;
			
		$player.addClass(TUBE_PLAYER_CLASS).data(OPTS, o);
		
		for(e in PLAYER) 
			$player.bind(e+TUBEPLAYER, $player, PLAYER[e]);
			
		var ID = o.playerID;
		players.push(ID); // keep track of players
		
		initDefaults($.tubeplayer.defaults, o, ID);
	
		// embed the player
		var containerID = "tubeplayer-player-container-"+players.length;
		jQuery("<div></div>").attr("id", containerID).appendTo($player);
		
		initPlayer(containerID, $player, o, ID);
		
		return $player; 
		
	};
	
	
	/**
	 * @param d - the defaults
	 * @param o - the options w/ methods to attach
	 * @param ID - the id of the player that is being init'd
	 */
	function initDefaults(d, o, ID){
	
		// default onPlayer events
		var dp = d.onPlayer;
		dp.unstarted[ID] = o.onPlayerUnstarted;
		dp.ended[ID] = o.onPlayerEnded;
		dp.playing[ID] = o.onPlayerPlaying;
		dp.paused[ID] = o.onPlayerPaused;
		dp.buffering[ID] = o.onPlayerBuffering;
		dp.cued[ID] = o.onPlayerCued;
		
		// default onQualityChange
		d.onQualityChange[ID] = o.onQualityChange;
		
		// default onError events
		var de = d.onErr;
		de.notFound[ID] = o.onErrorNotFound;
		de.notEmbeddable[ID] = o.onErrorNotEmbeddable;
		
	};
	
	/**
	 * init the iframed option if its requested and supported
	 * otherwise initialize the flash based player
	 * @param containerID - the container that the player will be installed into
	 * @param $player - the player that the tubeplayer binds to
	 * @param o - the init options
	 * @param ID - the id of the player that the container was created in
	 */
	function initPlayer(containerID, $player, o, ID){
		if(o.iframed && supportsHTML5())
			initIframePlayer(containerID, $player, o, ID);
		else
			initFlashPlayer(containerID, $player, o, ID);
	};
	
	/**
	 * check to see if iframe option is plausible
	 */
	function supportsHTML5(){
		return !!document.createElement('video').canPlayType;
	};
	
	/**
	 * Flash player initialization
	 * @requires swfobject
	 */
	function initFlashPlayer(containerID, $player, o, ID){
		var url =  "http://www.youtube.com/v/" + o.initialVideo +
						"?fs=1&enablejsapi=1&version=3&playerapiid=" + ID;
		swfobject.embedSWF(url, containerID, o.width, o.height, "8", null, null, { 
			allowScriptAccess: o.allowScriptAccess, 
			wmode: 'transparent', 
			allowFullScreen: o.allowFullScreen 
		}, { id: ID });
		// init the player ready fn
		onYouTubePlayerReady = function(playerId) { 
			var player = document.getElementById(playerId);
			player.addEventListener("onStateChange", "$.tubeplayer.defaults.stateChange('"+playerId+"')");
			player.addEventListener("onError", "$.tubeplayer.defaults.onError('"+playerId+"')");
			player.addEventListener("onPlaybackQualityChange", "$.tubeplayer.defaults.qualityChange('"+playerId+"')");
			var $player = $(player).parents("."+TUBE_PLAYER_CLASS);
			$.tubeplayer.defaults.afterReady($player);
		};
	};
	
	/**
	 * Initialize an iframe player
	 */
	function initIframePlayer(containerID, $player, o, ID){
		// write the api script tag
		var tag = document.createElement('script');
		tag.src = "http://www.youtube.com/player_api";
		var firstScriptTag = document.getElementsByTagName('script')[0];
		firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
		// 
		o.playerID = containerID;
		// init the iframe player
		onYouTubePlayerAPIReady = function(){
			new YT.Player(containerID, {
				videoId: o.initialVideo,
				width:o.width,
				height:o.height,
				playerVars: { 'autoplay': o.autoplay, 'controls': o.showcontrols },
				events: {
					'onReady': function(evt){
						ytplayers[o.playerID] = evt.target;
						var $player = $(evt.target).parents("."+TUBE_PLAYER_CLASS);
						$.tubeplayer.defaults.afterReady($player);
					},
					'onPlaybackQualityChange': $.tubeplayer.defaults.qualityChange(ID),
					'onStateChange': $.tubeplayer.defaults.stateChange(ID),
					'onError': $.tubeplayer.defaults.onError(ID)
				}
			});
		};
	};
	
	/**
	 * This method is the base method for all the events
	 * that are bound to the TubePlayer. 
	 */
	var buildFN = function(fn, after){
		return function(evt,param){
			var p = TubePlayer.getPkg(evt);
			if(p.ytplayer) { 
				var ret = fn(evt, param, p);
				if(typeof(ret)=="undefined") 
					ret = p.$player;
				return ret;
			}
			return p.$player;
		};
	};
	
	/**
	 * All the events that are bound to a TubePlayer instance
	 */
	var PLAYER = {
		cue: buildFN(function(evt,param,p){ 
			p.ytplayer.cueVideoById(param, p.opts.preferredQuality);
		}),
		play: buildFN(function(evt,param,p){
			if(typeof(param)=='object') 
				p.ytplayer.loadVideoById(param.id,param.time, p.opts.preferredQuality); 
			else if(param) 
				p.ytplayer.loadVideoById(param, 0, p.opts.preferredQuality); 
			else
				p.ytplayer.playVideo(); 
			p.opts.onPlay(param);
		}),
		pause: buildFN(function(evt,param,p){
			p.ytplayer.pauseVideo();
			p.opts.onPause();
		}),
		stop: buildFN(function(evt,param,p){
			p.ytplayer.stopVideo();
			p.opts.onStop();
		}),
		seek: buildFN(function(evt,param,p){
			p.ytplayer.seekTo(param, true);
			p.opts.onSeek(param);
		}),
		mute: buildFN(function(evt,param,p){
			p.ytplayer.mute(); 
			p.opts.onMute();
		}),
		unmute: buildFN(function(evt,param,p){
			p.ytplayer.unMute(); 
			p.ytplayer.setVolume(50); // YT API bug? 24/Jul/10
			p.opts.onUnMute();
		}),
		isMuted: buildFN(function(evt,param,p){
			return p.ytplayer.isMuted();
		}),
		volume: buildFN(function(evt,param,p){
			if(param) 
				p.ytplayer.setVolume(param);
			else 
				return p.ytplayer.getVolume() || -1; // -1 because iframe's currently in labs
		}),
		quality: buildFN(function(evt,param,p){
			if(param) 
				p.ytplayer.setPlaybackQuality(param); 
			else 
				return p.ytplayer.getPlaybackQuality();
		}),
		data: buildFN(function(evt,param,p){
			var ret = {}; 
			var P = p.ytplayer;
			ret.bytesLoaded = P.getVideoBytesLoaded(); 
			ret.bytesTotal = P.getVideoBytesTotal();
			ret.startBytes= P.getVideoStartBytes();
			ret.state = P.getPlayerState();
			ret.currentTime = P.getCurrentTime();
			ret.availableQualityLevels = P.getAvailableQualityLevels();
			ret.duration = P.getDuration();
			ret.videoURL = P.getVideoUrl();
			return ret;
		}),
		size: buildFN(function(evt, param, p){
			if(param.width && param.height) { 
				p.ytplayer.setSize(param.width, param.height);
				$(p.ytplayer).css(param);
			}
		}),
		destroy: buildFN(function(evt, param, p){
			p.$player.removeClass(TUBE_PLAYER_CLASS)
				.data(OPTS, null)
				.unbind(TUBEPLAYER).html("");
			if(YT)YT.Player = null; //clear the instance
			$(p.ytplayer).remove();
			return null;		
		}),
		player: buildFN(function(evt, param, p){
			return p.ytplayer;
		})
	};
	
	/**
	 * Internal utility to get the necessary context
	 * to the events bound to the tubeplayer
	 */
	var TubePlayer = {};
	TubePlayer.getPkg = function(evt){
		var $player = evt.data;
		var opts = $player.data(OPTS);
		var ytplayer;
		if(opts.iframed){
			ytplayer = ytplayers[opts.playerID] || null;
		} else {
			ytplayer = opts ? document.getElementById(opts.playerID) : null;
		}
		return {
			$player: $player,
			opts: opts,
			ytplayer: ytplayer
		}
	};
	
})(jQuery);
