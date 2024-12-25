package com.zlatenov.designpatterns;

/**
 * @author Angel Zlatenov
 */

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card. Cardholder: " + name);
    }
}