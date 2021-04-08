var apiclient = (function(){

    return{
        getCityByName : function(nameCity ,callback){
            var promise = $.ajax({
                url: "/clima/"+nameCity,
                type: 'GET',
                contentType: "application/json"
            });
            promise.then(
                function (data) {
                    console.info("OK");
                    callback(data);
                },
                function () {
                    console.info("ERROR");
            });
        }
    }
})();