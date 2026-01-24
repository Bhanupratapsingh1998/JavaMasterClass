package com.dsa2024.javaqa.java_patterns.strategy;

//Context
public class PricingService {

    private DiscountStrategy strategy;

    public PricingService(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double amount) {
        return strategy.applyDiscount(amount);
    }

    public static void main(String[] args) {
        PricingService pricing = new PricingService(new PremiumUserDiscount());
        System.out.println("PremiumUserDiscount: "+pricing.calculatePrice(1000));
    }
}
