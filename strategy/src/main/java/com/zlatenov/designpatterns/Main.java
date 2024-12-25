package com.zlatenov.designpatterns;

/**
 * @author Angel Zlatenov
 */

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100.0);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(150.0);

        // Switch to Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6f7G8h9I0J"));
        cart.checkout(200.0);
    }
}