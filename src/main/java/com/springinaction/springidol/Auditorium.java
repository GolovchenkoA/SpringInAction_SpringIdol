package com.springinaction.springidol;

/**
 * Created by головченко on 08.02.2017.
 */
public class Auditorium {
    private Boolean lightOn = false;

    public void turnLightOn() {
        this.lightOn = true;
    }

    public void turnLightOff() {
        this.lightOn = false;
    }

    public Boolean getLightOn() {
        return lightOn;
    }


}
