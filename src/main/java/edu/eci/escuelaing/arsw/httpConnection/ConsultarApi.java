package edu.eci.escuelaing.arsw.httpConnection;

import com.mashape.unirest.http.exceptions.UnirestException;

public interface ConsultarApi {

    public String getDataByCity(String nombreCiudad)throws UnirestException;
}
