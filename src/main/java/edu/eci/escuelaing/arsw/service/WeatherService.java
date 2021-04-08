package edu.eci.escuelaing.arsw.service;

import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.arsw.model.City;

public interface WeatherService {
    public City getCityByname(String nombre)throws JsonSyntaxException, UnirestException;
}
