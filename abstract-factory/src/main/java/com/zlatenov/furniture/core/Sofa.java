package com.zlatenov.furniture.core;


/**
 * Sofa represents an abstract product in the furniture family.
 * All concrete sofa types must implement this interface.
 *
 * author Angel Zlatenov
 */
public interface Sofa {
    /**
     * Simulates lying on the sofa.
     */
    void lieOn();

    /**
     * Gets the style of the sofa.
     * @return the style description
     */
    String getStyle();
}