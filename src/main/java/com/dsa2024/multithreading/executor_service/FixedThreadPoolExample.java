package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WebRequestHandler implements Runnable {
    private final int requestId;

    public WebRequestHandler(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        System.out.println("Processing request " + requestId + " on " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            executor.submit(new WebRequestHandler(i));
        }

        executor.shutdown();
    }
}