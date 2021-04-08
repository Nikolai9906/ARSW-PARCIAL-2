var app=(function(){
    var city;
    function setCity(){
        city=$("#dataCity").val();
    }
    function iniData(data){
        $("#city").text("City: "+ city);
        $("#id").text("id: "+ data.id);
        $("#timezone").text("timezone: "+ data.timezone);
        $("#dt").text("dt: "+ data.dt);
        $("#clouds").text("clouds: "+ data.clouds.all);
        $("#visibility").text("visibility: "+ data.visibility);
        $("#base").text("base: "+ data.base);

        for (var i=0;i<data.weather.length;i++){
            $("#weatherId").text("id: "+ data.weather[i].id);
            $("#main").text("main: "+ data.weather[i].main);
            $("#descrp").text("descrption: "+ data.weather[i].descrp);
            $("#icon").text("icon: "+ data.weather[i].icon);
        }
        $("#temp").text("temperature: "+ data.main.temp);
        $("#feelsLike").text("feels like: "+ data.main.feels_like);
        $("#tempMin").text("temperature min: "+ data.main.temp_min);
        $("#tempMax").text("temperature max: "+ data.main.temp_max);
        $("#pressure").text("pressure: "+ data.main.pressure );
        $("#humidity").text("humidity: "+ data.main.humidity);

        $("#speed").text("Speed: "+ data.wind.speed);
        $("#deg").text("deg: "+ data.wind.deg);

        $("#type").text("type: "+ data.sys.type);
        $("#sysId").text("id: "+ data.sys.id);
        $("#country").text("country: "+ data.sys.country);
        $("#sunrise").text("sunrise: "+ data.sys.sunrise);  
        $("#sunset").text("sunset: "+ data.sys.sunset);

        $("#lon").text("longitude: "+ data.coord.lon);  
        $("#lat").text("latitude: "+ data.coord.lat);
        plotMarkers(data.coord); 
    }
    var initMap = () => {
        map = new google.maps.Map(document.getElementById("map"), {
            zoom: 8,
            center: {lat: 4.61, lng: -74.08},
        });
    }
    const init = () =>{
        initMap();
    }
    function plotMarkers(m) {
        console.log(m)
        markers = [];
        bounds = new google.maps.LatLngBounds();
        var position = new google.maps.LatLng(m.lat, m.lon);
        console.log(position);
        markers.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP
            })
        );
        bounds.extend(position);
        map.fitBounds(bounds);
        map.setZoom(8);
    }
    function getCityByName(){
        apiclient.getCityByName(city, iniData); 
    }
  return{
    setCity: setCity,
    init:init,
    getCityByName:getCityByName

  }

})();