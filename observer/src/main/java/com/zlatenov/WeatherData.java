package com.zlatenov;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData is a concrete implementation of the Station interface.
 * It manages temperature data and notifies registered observers of any changes.
 * 
 * @see Station
 * @see Observer
 * 
 * @author Angel Zlatenov
 */
public class WeatherData implements Station {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
