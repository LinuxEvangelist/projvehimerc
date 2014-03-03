map = null;geocoder=null;x=0;show='';lista='';


    function initialize(la,lo,m,z) {
      if (GBrowserIsCompatible()) {
        map = new GMap2(document.getElementById("map_canvas"));
        map.setCenter(new GLatLng(la,lo), z);
        map.setUIToDefault();
        geocoder = new GClientGeocoder();
       if(m==''){
            //newMarker(la, lo,'');
        }else{
            newMarker(la, lo, m);
        }


       }
    }
       /*
        GEvent.addListener(map,"click", function(overlay,latlng) {
          if (overlay) {
            // ignore if we click on the info window
            return;
          }
          var tileCoordinate = new GPoint();
          var tilePoint = new GPoint();
          var currentProjection = G_NORMAL_MAP.getProjection();
          tilePoint = currentProjection.fromLatLngToPixel(latlng,
map.getZoom());
          tileCoordinate.x = Math.floor(tilePoint.x / 256);
          tileCoordinate.y = Math.floor(tilePoint.y / 256);
          var myHtml = "Latitude: " + latlng.lat() + "<br/>Longitude: "
+ latlng.lng() +
            "<br/>The Tile Coordinate is:<br/> x: " + tileCoordinate.x +
            "<br/> y: " + tileCoordinate.y + "<br/> at zoom level " +
map.getZoom();
          map.openInfoWindow(latlng, myHtml);
        });
        */

    function initialize_rute() {
        map = new GMap2(document.getElementById("map_canvas"));
        map.setCenter(new GLatLng(-6.771852,-79.838569), 15);
        directionsPanel = document.getElementById("route");
        directions = new GDirections(map, directionsPanel);
        directions.load("from: Chiclayo to: Lima");
      }
