package com.zlatenov;

/**
 * CheesePizza is a concrete implementation of the Pizza interface.
 *
 * @see Pizza
 *
 * @author Angel Zlatenov
 */
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing cheese pizza...");
    }
}