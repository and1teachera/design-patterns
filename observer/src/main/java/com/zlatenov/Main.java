package com.zlatenov;

/**
 * @author Angel Zlatenov
 */
public class Main {
    public static void main(String[] args) {
        Station weatherStation = new WeatherData();

        // Create observers
        Display phoneDisplay = new PhoneDisplay("Phone");
        Display windowDisplay = new WindowDisplay("Window");

        // Register observers with the subject
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);

        // Simulate a temperature change
        System.out.println("Weather station updates temperature:");
        weatherStation.setTemperature(25.0f);

        // Simulate another temperature change
        System.out.println("\nWeather station updates temperature again:");
        weatherStation.setTemperature(30.0f);

        // Unregister one observer and update temperature
        System.out.println("\nRemoving window display and updating temperature:");
        weatherStation.removeObserver(windowDisplay);
        weatherStation.setTemperature(28.0f);
    }
}