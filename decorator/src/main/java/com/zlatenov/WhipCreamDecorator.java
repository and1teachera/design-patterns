package com.zlatenov;

/**
 * WhipCreamDecorator is a concrete implementation of the CoffeeDecorator class.
 * It adds whip cream to the coffee and updates the cost and description accordingly.
 * 
 * @see CoffeeDecorator
 * @see Coffee
 * 
 * @autor Angel Zlatenov
 */
public class WhipCreamDecorator extends CoffeeDecorator {
    /**
     * Constructs a WhipCreamDecorator with the specified coffee object.
     * 
     * @param coffee the coffee object to be decorated
     */
    public WhipCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip Cream";
    }
}

