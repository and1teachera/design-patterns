package com.zlatenov;

/**
 * Observer is an interface for objects that should be notified of changes in the subject's state.
 * 
 * @see Subject
 * 
 * @autor Angel Zlatenov
 */
public interface Observer {
    /**
     * Updates the observer with the new temperature.
     * 
     * @param temperature the new temperature
     */
    void update(float temperature);
}