package com.zlatenov.designpatterns;

/**
 * CreditCardPayment is a concrete implementation of the PaymentStrategy interface.
 * It processes payments using a credit card.
 * 
 * @see PaymentStrategy
 * 
 * @author Angel Zlatenov
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    /**
     * Constructs a CreditCardPayment with the specified card number and cardholder name.
     * 
     * @param cardNumber the credit card number
     * @param name the cardholder name
     */
    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    /**
     * Processes the payment using a credit card.
     * 
     * @param amount the amount to be paid
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card. Cardholder: " + name);
    }
}