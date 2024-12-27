package com.zlatenov;

/**
 * WindowDisplay is a concrete implementation of the Display interface.
 * It represents a display element for larger, fixed-location displays that shows the current temperature.
 * 
 * @see Display
 * 
 * @autor Angel Zlatenov
 */
public class WindowDisplay implements Display {
    private String name;
    private float temperature;

    /**
     * Constructs a WindowDisplay with the specified name.
     * 
     * @param name the name of the display
     */
    public WindowDisplay(String name) {
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
