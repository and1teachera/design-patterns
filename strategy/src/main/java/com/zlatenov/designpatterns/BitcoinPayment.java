package com.zlatenov.designpatterns;

/**
 * @author Angel Zlatenov
 */

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Bitcoin. Wallet: " + walletAddress);
    }
}