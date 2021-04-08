package edu.eci.escuelaing.arsw.model;

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    /**
     * Constructor de la clase Weather
     * @param id informacion de la ciudad
     * @param main informacion de la ciudad
     * @param description informacion de la ciudad
     * @param icon informacion de la ciudad
     */
    public Weather(int id, String main, String description, String icon){
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
    public Weather() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMain() {
        return main;
    }
    public void setMain(String main) {
        this.main = main;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
}

