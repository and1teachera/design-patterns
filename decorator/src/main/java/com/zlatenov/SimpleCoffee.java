package com.zlatenov;

/**
 * SimpleCoffee is a concrete implementation of the Coffee interface.
 * It represents a basic coffee with a fixed cost and description.
 * 
 * @see Coffee
 * 
 * @autor Angel Zlatenov
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
