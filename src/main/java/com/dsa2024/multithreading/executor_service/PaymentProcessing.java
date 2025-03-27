package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.CompletableFuture;

public class PaymentProcessing {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Payment successful!";
        }).thenApply(status -> {
            return "Email sent: " + status;
        }).thenAccept(System.out::println);

        System.out.println("Waiting for payment completion...");

        // Prevent the main thread from exiting before async task completes
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
    }
}