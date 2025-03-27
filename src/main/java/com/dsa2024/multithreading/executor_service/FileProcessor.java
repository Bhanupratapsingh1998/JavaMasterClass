package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.*;

public class FileProcessor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> fileTask = () -> {
            Thread.sleep(1000);  
            if (Math.random() > 0.5) throw new RuntimeException("File not found!");
            return "File processed successfully!";
        };

        Future<String> future = executor.submit(fileTask);

        try {
            System.out.println(future.get()); // Blocking
        } catch (ExecutionException e) {
            System.err.println("Error: " + e.getCause().getMessage());
        }

        executor.shutdown();
    }
}
