package com.zlatenov;

/**
 * Demonstrates the usage of the Decorator pattern in a coffee shop context.
 * Shows how different coffee combinations can be created dynamically using decorators.
 *
 * @author Angel Zlatenov
 */
public class Main {
    public static void main(String[] args) {
        // Demonstrate basic coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("\nOrdering a simple coffee:");
        printCoffeeDetails(simpleCoffee);

        // Demonstrate coffee with milk
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println("\nOrdering a coffee with milk:");
        printCoffeeDetails(milkCoffee);

        // Demonstrate coffee with milk and sugar
        Coffee sweetMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("\nOrdering a coffee with milk and sugar:");
        printCoffeeDetails(sweetMilkCoffee);

        // Demonstrate deluxe coffee with all toppings
        Coffee deluxeCoffee = new WhipCreamDecorator(
                new SugarDecorator(
                        new MilkDecorator(new SimpleCoffee())));
        System.out.println("\nOrdering a deluxe coffee with all toppings:");
        printCoffeeDetails(deluxeCoffee);
    }

    private static void printCoffeeDetails(Coffee coffee) {
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + String.format("%.2f", coffee.getCost()));
    }
}