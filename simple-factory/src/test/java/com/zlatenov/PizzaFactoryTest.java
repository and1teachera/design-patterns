package com.zlatenov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for the PizzaFactory implementation.
 *
 * @author Angel Zlatenov
 */
public class PizzaFactoryTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    @DisplayName("Should create cheese pizza")
    void shouldCreateCheesePizza() {
        Pizza pizza = PizzaFactory.createPizza("cheese");
        assertTrue(pizza instanceof CheesePizza);

        pizza.prepare();
        assertTrue(outputStream.toString().contains("Preparing cheese pizza..."));
    }

    @Test
    @DisplayName("Should create pepperoni pizza")
    void shouldCreatePepperoniPizza() {
        Pizza pizza = PizzaFactory.createPizza("pepperoni");
        assertTrue(pizza instanceof PepperoniPizza);

        pizza.prepare();
        assertTrue(outputStream.toString().contains("Preparing pepperoni pizza..."));
    }

    @Test
    @DisplayName("Should throw exception for unknown pizza type")
    void shouldThrowExceptionForUnknownType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PizzaFactory.createPizza("unknown");
        });
        assertEquals("Unknown pizza type: unknown", exception.getMessage());
    }

    @Test
    @DisplayName("Should handle case-insensitive pizza types")
    void shouldHandleCaseInsensitivePizzaTypes() {
        Pizza pizza1 = PizzaFactory.createPizza("CHEESE");
        Pizza pizza2 = PizzaFactory.createPizza("Pepperoni");

        assertTrue(pizza1 instanceof CheesePizza);
        assertTrue(pizza2 instanceof PepperoniPizza);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}