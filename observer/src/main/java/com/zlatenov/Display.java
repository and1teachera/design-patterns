package com.zlatenov;

/**
 * Display is a business model interface that extends the Observer interface.
 * It represents a display element that shows the current state.
 * 
 * @see Observer
 * @see PhoneDisplay
 * @see WindowDisplay
 * 
 * @author Angel Zlatenov
 */
public interface Display extends Observer {
    /**
     * Displays the current state.
     */
    void show();
}
