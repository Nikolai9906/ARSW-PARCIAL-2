package edu.eci.escuelaing.arsw.model;

public class Wind {
    private float speed;
    private int deg;

    /**
     * Contructor de la clase Wind
     * @param speed informacion de la ciudad
     * @param deg informacion de la ciudad
     */
    public Wind(float speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }
    /**
     * Contructor de la clase Main
     */
    public Wind() {

    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public int getDeg() {
        return deg;
    }
    public void setDeg(int deg) {
        this.deg = deg;
    }
}
