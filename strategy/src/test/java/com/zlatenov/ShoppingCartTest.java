package com.zlatenov;

import com.zlatenov.designpatterns.BitcoinPayment;
import com.zlatenov.designpatterns.CreditCardPayment;
import com.zlatenov.designpatterns.PayPalPayment;
import com.zlatenov.designpatterns.ShoppingCart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Angel Zlatenov
 */

public class ShoppingCartTest {
    private ShoppingCart cart;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    @DisplayName("Should handle no payment strategy")
    void shouldHandleNoPaymentStrategy() {
        cart.checkout(100.0);
        assertEquals("Please select a payment method.", outputStream.toString().trim());
    }

    @Test
    @DisplayName("Should process credit card payment")
    void shouldProcessCreditCardPayment() {
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100.0);
        assertEquals("Paid $100.0 with Credit Card. Cardholder: John Doe", outputStream.toString().trim());
    }

    @Test
    @DisplayName("Should process PayPal payment")
    void shouldProcessPayPalPayment() {
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(150.0);
        assertEquals("Paid $150.0 with PayPal. Email: john.doe@example.com", outputStream.toString().trim());
    }

    @Test
    void shouldProcessBitcoinPayment() {
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6f7G8h9I0J"));
        cart.checkout(200.0);
        assertEquals("Paid $200.0 with Bitcoin. Wallet: 1A2b3C4d5E6f7G8h9I0J", outputStream.toString().trim());
    }

    @Test
    void shouldSwitchPaymentStrategies() {
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100.0);
        String firstPayment = outputStream.toString();
        outputStream.reset();

        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(150.0);
        String secondPayment = outputStream.toString();

        assertTrue(firstPayment.contains("Credit Card"));
        assertTrue(secondPayment.contains("PayPal"));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}