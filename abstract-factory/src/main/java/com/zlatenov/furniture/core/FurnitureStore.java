package com.zlatenov.furniture.core;

/**
 * FurnitureStore represents a store that sells furniture of a particular style.
 * It uses a FurnitureFactory to create furniture items.
 * @see FurnitureFactory
 * @see Chair
 * @see Sofa
 *
 * @author Angel Zlatenov
 */
public class FurnitureStore {
    private Chair chair;
    private Sofa sofa;

    public FurnitureStore(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    /**
     * Displays the furniture items in the store.
     */
    public void displayFurniture() {
        chair.sitOn();
        sofa.lieOn();
    }
}