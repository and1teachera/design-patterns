package com.zlatenov.furniture.core;

/**
 * Chair represents an abstract product in the furniture family.
 * All concrete chair types must implement this interface.
 *
 * author Angel Zlatenov
 */
public interface Chair {
    /**
     * Simulates sitting on the chair.
     */
    void sitOn();

    /**
     * Gets the style of the chair.
     * @return the style description
     */
    String getStyle();
}