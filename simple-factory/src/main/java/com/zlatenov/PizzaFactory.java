package com.zlatenov;

/**
 * PizzaFactory is a simple factory that creates different types of pizzas.
 * It encapsulates the object creation logic and provides a single point of entry for creating pizzas.
 *
 * @author Angel Zlatenov
 */
public class PizzaFactory {
    /**
     * Creates and returns a pizza based on the provided type.
     *
     * @param type the type of pizza to create
     * @return the created Pizza instance
     * @throws IllegalArgumentException if the pizza type is unknown
     */
    public static Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        };
    }
}