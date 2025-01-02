package com.zlatenov.designpatterns;

/**
 * ShoppingCart is the context class in the Strategy pattern.
 * It maintains a reference to a PaymentStrategy and delegates the payment processing to the strategy.
 *
 * @see PaymentStrategy
 *
 * @author Angel Zlatenov
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    /**
     * Sets the payment strategy to be used by the shopping cart.
     * 
     * @param paymentStrategy the payment strategy to be used
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Processes the payment for the specified amount using the current payment strategy.
     * If no payment strategy is set, it prompts the user to select a payment method.
     * 
     * @param amount the amount to be paid
     */
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}