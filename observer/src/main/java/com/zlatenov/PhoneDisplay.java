package com.zlatenov;

/**
 * PhoneDisplay is a concrete implementation of the Display interface.
 * It represents a display element for mobile devices that shows the current temperature.
 * 
 * @see Display
 * 
 * @autor Angel Zlatenov
 */
public class PhoneDisplay implements Display {
    private String name;
    private float temperature;

    /**
     * Constructs a PhoneDisplay with the specified name.
     * 
     * @param name the name of the display
     */
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