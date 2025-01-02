package com.zlatenov;

/**
 * MilkDecorator is a concrete implementation of the CoffeeDecorator class.
 * It adds milk to the coffee and updates the cost and description accordingly.
 * 
 * @see CoffeeDecorator
 * @see Coffee
 * 
 * @author Angel Zlatenov
 */
public class MilkDecorator extends CoffeeDecorator {
    /**
     * Constructs a MilkDecorator with the specified coffee object.
     * 
     * @param coffee the coffee object to be decorated
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}