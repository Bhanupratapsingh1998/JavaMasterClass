package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.*;

public class StockPriceFetcher {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Double> future = executor.submit(() -> {
            Thread.sleep(2000);  
            return 150.75;
        });

        System.out.println("Fetching stock price...");
        
        // Blocking call
        Double price = future.get();
        System.out.println("Stock price: $" + price);

        executor.shutdown();
    }
}
