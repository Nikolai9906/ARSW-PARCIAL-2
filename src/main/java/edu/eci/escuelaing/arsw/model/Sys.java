package edu.eci.escuelaing.arsw.model;

public class Sys {
    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;

    /**
     * Contructor de la clase Sys
     * @param type informacion de la ciudad
     * @param id informacion de la ciudad
     * @param country informacion de la ciudad
     * @param sunrise informacion de la ciudad
     * @param sunset informacion de la ciudad
     */
    public Sys(int type, int id, String country, int sunrise, int sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
    /**
     * Contructor de la clase Sys
     */
    public Sys() {

    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getSunrise() {
        return sunrise;
    }
    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }
    public int getSunset() {
        return sunset;
    }
    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
}
