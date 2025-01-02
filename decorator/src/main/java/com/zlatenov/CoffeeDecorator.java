package com.zlatenov;

/**
 * CoffeeDecorator is an abstract class that implements the Coffee interface.
 * It serves as a base class for all coffee decorators, allowing additional functionality to be added to coffee objects.
 * 
 * @see Coffee
 * @see MilkDecorator
 * @see SugarDecorator
 * @see WhipCreamDecorator
 * 
 * @author Angel Zlatenov
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    /**
     * Constructs a CoffeeDecorator with the specified coffee object.
     * 
     * @param coffee the coffee object to be decorated
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}

