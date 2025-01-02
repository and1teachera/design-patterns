package com.zlatenov.designpatterns;

/**
 * PaymentStrategy is an interface for payment processing strategies.
 * Concrete implementations of this interface will provide specific payment methods.
 * 
 * @see BitcoinPayment
 * @see CreditCardPayment
 * @see PayPalPayment
 * 
 * @author Angel Zlatenov
 */
public interface PaymentStrategy {

    /**
     * Processes the payment of the specified amount.
     * 
     * @param amount the amount to be paid
     */
    void pay(double amount);
}