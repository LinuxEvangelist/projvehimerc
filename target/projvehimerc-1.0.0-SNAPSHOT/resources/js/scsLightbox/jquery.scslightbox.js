/**
 * jQuery scsLightBox plugin
 * @name jquery-scslightbox.js
 * @author Pascal (Scalpweb) Mugnier - http://www.pascalmugnier.com
 * @version 0.5
 * @date March 17, 2011
 * @category jQuery plugin
 * @copyright (c) 2011 Pascal (Scalpweb) Mugnier (www.pascalmugnier.com)
 * @license Creative Commons http://creativecommons.org/licenses/by/3.0/
 * @example Please visit http://www.pascalmugnier.com/jQuery-plugin-lightbox.html
 */

$.fn.scsLightbox = function(options)
{  
	// --
	// -- Options :
	// --
	var prefix = 'scsLightbox_';
	var shadowOnNext = true;
	var defaults = {  
			closeButton: true,  
			shadow: true,  
			delay: 200,  
			allowNavigate: true,
			allowResize: true
		};  
	var options = $.extend(defaults, options);  
	
	// --
	// -- Handling page events :
	// --
	$(document).keydown(
				function(e)
				{
					// -- Hidding box if espace key is pressed :
					if (e.keyCode == '27')
						__close()
					return true;
				}
			);
	$(document).scroll(function() { __resizing() });
	$(window).resize(function() { __resizing() });
			
	// --
	// -- Building shadow :
	// --
	if(options.shadow && $('#'+prefix+'shadow').size() < 1)
	{
		$('body').append('<div id="'+prefix+'shadow" class="scslbShadow"></div>');
		$('#'+prefix+'shadow').hide();
		$('#'+prefix+'shadow').click(function(e){__close();});
	}
	
	// --
	// -- Building the box :
	// --
	if($('#'+prefix+'box').size() < 1)
	{
		$('body').append('<div id="'+prefix+'box" class="scslbBox"><div class="close"></div><div class="next"></div><div class="previous"></div><div class="boxContent"></div><div class="boxFooter"></div></div>');
		$('#'+prefix+'box').hide();
	}
	
	// --
	// -- Close :
	// --
	if(options.closeButton)
		$('#'+prefix+'box .close').click(function(e){__close();});
		
	// -- 
	// -- Show options :
	// --
	function __doOptions(box, obj)
	{
		if(options.closeButton)
			$('.close', box).fadeIn(options.delay);
		if(options.allowNavigate)
		{
			var prev = 0;
			var next = 0;
			var found = false;
			$('.scslbMarker').each(function()
									{
										if(obj == this)
											found = true;
										else
										{
											if(!found)
												prev = $(this);
											else if(found && next == 0)
												next = $(this);
										}
									}
								);
			if(prev != 0)
				$('.previous', box).delay(options.delay*2).fadeIn(options.delay);
			if(next != 0)
				$('.next', box).delay(options.delay*2).fadeIn(options.delay);
		}
	}
	function __updatingButtonPosition(box)
	{
		if($('embed, object, select, iframe, div, span, table, p, a', $('#'+prefix+'box .boxContent')).size() > 0)
		{
			$('.previous', box).css('left', '-59px');
			$('.next', box).css('marginLeft', '-4px');
		}
		else
		{
			$('.previous', box).css('left', '0px');
			$('.next', box).css('marginLeft', '-63px');
		}
	}
	
	// -- 
	// -- Closing :
	// --
	function __close()
	{
		$('embed, object, select').css({ 'visibility' : 'visible'});
		$('#'+prefix+'box, .close').hide();
		$('#'+prefix+'box, .next').hide();
		$('#'+prefix+'box, .previous').hide();
		if(shadowOnNext)
			$('#'+prefix+'shadow').fadeOut(options.delay);
		else
			shadowOnNext = true;
		$('#'+prefix+'box').fadeOut(options.delay);
		$('#'+prefix+'box .boxContent').css('width', 'auto');
	}
	
	// -- 
	// -- Resizing :
	// --
	function __resizing()
	{
		if(options.shadow)
		{
			$('#'+prefix+'shadow').css('top', $(document).scrollTop());
			$('#'+prefix+'shadow').css('left', $(document).scrollLeft());
		}
		$('#'+prefix+'box').css('marginLeft',  $(document).scrollLeft()-($('#'+prefix+'box').outerWidth()  / 2));
		$('#'+prefix+'box').css('top', 40 + $(document).scrollTop());
	}
	
	// --
	// -- For each targets :
	// --
	return this.each(
		function()
		{
			var obj = $(this);
			var shadow = $('#'+prefix+'shadow');
			var box = $('#'+prefix+'box');
			var target = obj.attr('href');
			
			// -- Marker :
			obj.addClass('scslbMarker');
			
			// -- Hiding the targeted div :
			if(target.substr(0,1) == '#')
				$('#'+target.substr(1)).hide();
			
			// --
			// -- Handling onClick function :
			// --
			obj.click(
				function()
				{
					var obj = this;
					// -- Enable navigation :
					if(options.allowNavigate)
					{
						var prev = 0;
						var next = 0;
						var found = false;
						$('.scslbMarker').each(function()
												{
													if(obj == this)
														found = true;
													else
													{
														if(!found)
															prev = $(this);
														else if(found && next == 0)
															next = $(this);
													}
												}
											);
						$('.previous', box).unbind('click');
						$('.next', box).unbind('click');
						$('.previous', box).click(function(e){shadowOnNext = false; __close(); prev.click();});
						$('.next', box).click(function(e){shadowOnNext = false; __close(); next.click();});
					}
	
					// -- Hiding flash objects :
					$('embed, object, select').css({ 'visibility' : 'hidden' });
					
					// -- Resize :
					$(box).css('width', 'auto');
					$(box).css('height', 'auto');
					
					// -- Display shadow :
					if(options.shadow)
					{
						shadow.css('top', $(document).scrollTop());
						shadow.css('left', $(document).scrollLeft());
						if(!shadow.is(':visible'))
							shadow.fadeIn(options.delay);
					}
					
					// -- Filling in the box :
					if(target.substr(0,1) == '#')
					{
						// -- Showing a div :
						if($('#'+target.substr(1)).css('width') == 'auto')
							$('#'+target.substr(1)).css('width', ($(document).width() - $(document).width()/10));
						$('.boxContent', box).html($('#'+target.substr(1)).html());
						$('.boxContent', box).append('</div>').prepend('<div>');
						$('.boxContent', box).first().css('width', $('#'+target.substr(1)).css('width'));
						$('.boxContent', box).find('embed, object, select').css({ 'visibility' : 'visible' });
						__doOptions(box, obj);
						__updatingButtonPosition(box);
					}
					else
					{
						// -- Showing an image :
						$('.boxContent', box).html('<div class="loaderContainer"><div class="loader"></div></div>');
						var imgLoader = new Image();
						imgLoader.onload = function()
								{
									// -- Resizing :
									if(options.allowResize)
									{
										var overWidth = (screen.availWidth-80) - $(this).attr('width');
										var overHeight = (screen.availHeight-80) - $(this).attr('height');
										if(overWidth < 0 && overWidth < overHeight)
										{
											$(this).css('width', screen.availWidth - 80);
											$(this).css('height', screen.availHeight / ($(this).attr('width') / (screen.availWidth - 80)));
										}
										if(overHeight < 0 && overHeight < overWidth)
										{
											$(this).css('height', screen.availHeight - 80);
											$(this).css('width', screen.availWidth / ($(this).attr('height') / (screen.availHeight - 80)));
										}
									}
									// -- Showing :
									$('.loader', box).fadeOut(options.delay);
									$('.boxContent', box).html($(this));
									__doOptions(box, obj);
									__resizing();
									__updatingButtonPosition(box);
									// -- Clear :
									imgLoader.onload = function(){};
								};
						imgLoader.src = target;
					}
					
					// -- Displaying the box :
					box.fadeIn(options.delay);
					__resizing();
					
					// -- The browser must not try to follow the link :
					return false;
				}
			);

		}
		
	);
	
}; 