package com.zlatenov;

/**
 * Subject is an interface for objects that can be observed by observers.
 * It defines methods for adding, removing, and notifying observers.
 * 
 * @see Observer
 * @see Station
 * @see WeatherData
 * 
 * @autor Angel Zlatenov
 */
public interface Subject {
    /**
     * Adds an observer to the list of observers.
     * 
     * @param observer the observer to be added
     */
    void addObserver(Observer observer);

    /**
     * Removes an observer from the list of observers.
     * 
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all observers of a change in state.
     */
    void notifyObservers();
}
