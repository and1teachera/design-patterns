package com.zlatenov;

/**
 * PepperoniPizza is a concrete implementation of the Pizza interface.
 *
 * @see Pizza
 * @author Angel Zlatenov
 */
public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking pepperoni pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing pepperoni pizza...");
    }
}