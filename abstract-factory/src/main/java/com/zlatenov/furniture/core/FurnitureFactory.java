package com.zlatenov.furniture.core;


/**
 * FurnitureFactory is the abstract factory interface that declares methods
 * for creating each type of product in the furniture family.
 * @see Chair
 * @see Sofa
 *
 * @author Angel Zlatenov
 */
public interface FurnitureFactory {
    /**
     * Creates a chair of the factory's style.
     * @return a new chair instance
     */
    Chair createChair();

    /**
     * Creates a sofa of the factory's style.
     * @return a new sofa instance
     */
    Sofa createSofa();

    /**
     * Gets the style of furniture this factory produces.
     * @return the style name
     */
    String getStyle();
}