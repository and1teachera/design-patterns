package com.zlatenov.designpatterns;

/**
 * BitcoinPayment is a concrete implementation of the PaymentStrategy interface.
 * It processes payments using Bitcoin.
 * 
 * @see PaymentStrategy
 * 
 * @autor Angel Zlatenov
 */
public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    /**
     * Constructs a BitcoinPayment with the specified wallet address.
     * 
     * @param walletAddress the Bitcoin wallet address
     */
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    /**
     * Processes the payment using Bitcoin.
     * 
     * @param amount the amount to be paid
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Bitcoin. Wallet: " + walletAddress);
    }
}