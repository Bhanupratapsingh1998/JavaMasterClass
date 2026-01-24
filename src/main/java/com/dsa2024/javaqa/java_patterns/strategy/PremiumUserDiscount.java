package com.dsa2024.javaqa.java_patterns.strategy;

//Implementations
public class PremiumUserDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}
