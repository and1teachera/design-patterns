package com.zlatenov;

/**
 * Station is a business model interface that extends the Subject interface.
 * It represents a weather station that can set and notify temperature changes.
 * 
 * @see Subject
 * @see WeatherData
 * 
 * @autor Angel Zlatenov
 */
public interface Station extends Subject {
    /**
     * Sets the temperature and notifies all observers.
     * 
     * @param temperature the new temperature
     */
    void setTemperature(float temperature);
}