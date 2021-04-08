package edu.eci.escuelaing.arsw.model;

public class Cordenadas {
    private float lon;
    private float lat;
    /**
     * Contructor de la clase cordenadas
     * @param lon Longitud de la ciudad
     * @param lat latitud de la ciudad
     */
    public Cordenadas(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }
    /**
     * Contructor de la clase cordenadas
     */
    public Cordenadas() {

    }
    public float getLon() {
        return lon;
    }
    public void setLon(float lon) {
        this.lon = lon;
    }
    public float getLat() {
        return lat;
    }
    public void setLat(float lat) {
        this.lat = lat;
    }
}

