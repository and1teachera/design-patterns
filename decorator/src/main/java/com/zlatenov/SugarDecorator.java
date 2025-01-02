package com.zlatenov;

/**
 * SugarDecorator is a concrete implementation of the CoffeeDecorator class.
 * It adds sugar to the coffee and updates the cost and description accordingly.
 * 
 * @see CoffeeDecorator
 * @see Coffee
 * 
 * @author Angel Zlatenov
 */
public class SugarDecorator extends CoffeeDecorator {
    /**
     * Constructs a SugarDecorator with the specified coffee object.
     * 
     * @param coffee the coffee object to be decorated
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}


