package edu.eci.escuelaing.arsw.cache.impl;

import edu.eci.escuelaing.arsw.cache.Cache;
import edu.eci.escuelaing.arsw.model.City;
import org.javatuples.Pair;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service("cache")
public class CacheImpl implements Cache {

    private Map<String, Pair<City, Date>> cache;

    /**
     * Contructor del cache
     */
    public CacheImpl() {
        cache = new ConcurrentHashMap<String, Pair<City, Date>>();
    }

    /**
     * Guarda en el cache
     * @param nombreCiudad el nombre de la ciudad a guardar
     * @param ciudad Ciudad a guardar
     */
    @Override
    public void guardarCiudad(String nombreCiudad,City ciudad){
        Pair<City,Date>tupla=new Pair<City,Date>(ciudad,new Date());
        cache.put(nombreCiudad,tupla);
    }

    /**
     * Borra la ciudad del cache
     * @param nombreCiudad
     */
    @Override
    public void borrarCiudad(String nombreCiudad){
        cache.remove(nombreCiudad);
    }
    @Override
    public Boolean ciudadEnCache(String nombreCiudad){
        boolean enCache;
        if(cache.get(nombreCiudad).equals(null)){
            enCache=false;
        }else{
            enCache=true;
        }
        return enCache;
    }

    /**
     * Mira si esta en el cache y si cumple con el tiempo
     * @param nombreCiudad
     * @return
     */
    @Override
    public boolean vencido(String nombreCiudad) {
        boolean expirado;
        if(cache.get(nombreCiudad)!=(null)){
            Date fecha=cache.get(nombreCiudad).getValue1();

            if(new Date().getTime()-fecha.getTime()>=30000){
                expirado=true;
            }else{
                expirado=false;
            }
        }else{
            expirado=true;
        }
        return expirado;
    }
    @Override
    public City obtenerCiudadPorNombre(String nombreCiudad){
        return cache.get(nombreCiudad).getValue0();
    }
}
