package edu.eci.escuelaing.arsw.controller;

import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.arsw.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/clima")
public class WeatherController {
    @Autowired
    @Qualifier("WeatherService")
    private WeatherService weatherService;

    @RequestMapping (method = RequestMethod.GET,value = "/{city}")
    public ResponseEntity<?> getCiudad(@PathVariable String city){
        try{
            return new ResponseEntity<>(weatherService.getCityByname(city), HttpStatus.ACCEPTED);
        }catch (JsonSyntaxException | UnirestException e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }


}
