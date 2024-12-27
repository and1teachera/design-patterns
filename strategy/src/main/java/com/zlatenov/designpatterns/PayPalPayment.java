package com.zlatenov.designpatterns;

/**
 * PayPalPayment is a concrete implementation of the PaymentStrategy interface.
 * It processes payments using PayPal.
 * 
 * @see PaymentStrategy
 * 
 * @autor Angel Zlatenov
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;

    /**
     * Constructs a PayPalPayment with the specified email address.
     * 
     * @param email the PayPal email address
     */
    public PayPalPayment(String email) {
        this.email = email;
    }

    /**
     * Processes the payment using PayPal.
     * 
     * @param amount the amount to be paid
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with PayPal. Email: " + email);
    }
}
