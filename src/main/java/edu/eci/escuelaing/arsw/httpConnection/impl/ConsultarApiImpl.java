package edu.eci.escuelaing.arsw.httpConnection.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.arsw.httpConnection.ConsultarApi;
import org.springframework.stereotype.Component;

@Component("ConsultarApiImpl")
public class ConsultarApiImpl implements ConsultarApi {
    public String getDataByCity(String city)throws UnirestException{
        HttpResponse<String> response= Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=cce6551c50d06bfb5867740f1428723a")
                .asString();
        return response.getBody();
    }
}
