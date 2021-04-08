package edu.eci.escuelaing.arsw.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.arsw.cache.Cache;
import edu.eci.escuelaing.arsw.httpConnection.ConsultarApi;
import edu.eci.escuelaing.arsw.model.City;
import edu.eci.escuelaing.arsw.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("WeatherService")
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    @Qualifier("ConsultarApiImpl")

    ConsultarApi consultarApi;
    @Autowired
    @Qualifier("cache")

    Cache cache;

    @Override
    public City getCityByname(String nombre) throws JsonSyntaxException, UnirestException {
        City ciudad;
        if(cache.vencido(nombre)){
            Gson gson=new Gson();
            ciudad=gson.fromJson(consultarApi.getDataByCity(nombre),City.class);
            cache.guardarCiudad(nombre,ciudad);
        }else{
            ciudad=cache.obtenerCiudadPorNombre(nombre);
        }
        return ciudad;
    }
}
