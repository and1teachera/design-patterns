package com.zlatenov;

/**
 * Main class to demonstrate the usage of the Simple Factory pattern in a pizza store context.
 *
 * @see Pizza
 * @see PizzaFactory
 * @see CheesePizza
 * @see PepperoniPizza
 *
 * @author Angel Zlatenov
 */
public class Main {
    public static void main(String[] args) {
        // Create a cheese pizza
        System.out.println("Ordering a cheese pizza:");
        Pizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.box();

        // Create a pepperoni pizza
        System.out.println("\nOrdering a pepperoni pizza:");
        Pizza pepperoniPizza = PizzaFactory.createPizza("pepperoni");
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.box();

        // Try to create an invalid pizza (will throw an exception)
        try {
            System.out.println("\nTrying to order an invalid pizza:");
            Pizza invalidPizza = PizzaFactory.createPizza("pineapple");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}