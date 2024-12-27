package com.zlatenov;

/**
 * @author Angel Zlatenov
 */
public class PhoneDisplay implements Display {
    private String name;
    private float temperature;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        show();
    }

    @Override
    public void show() {
        System.out.println(name + " display: Temperature is " + temperature + "°C");
    }
}