package edu.eci.escuelaing.arsw.cache;

import edu.eci.escuelaing.arsw.model.City;

public interface Cache {
    /**
     * Metodo que es encargado para insertar datos al cache
     * @param nombreCiudad el nombre de la ciudad a guardar
     * @param ciudad Ciudad a guardar
     */

    public void guardarCiudad(String nombreCiudad, City ciudad);

    public void borrarCiudad(String nombreCiudad);

    public Boolean ciudadEnCache(String nombreCiudad);

    public City obtenerCiudadPorNombre(String nombreCiudad);

    public boolean vencido(String nombreCiudad);
}
