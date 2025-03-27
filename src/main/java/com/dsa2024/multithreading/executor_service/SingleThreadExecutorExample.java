package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LogWriter implements Runnable {
    private final String logMessage;

    public LogWriter(String logMessage) {
        this.logMessage = logMessage;
    }

    @Override
    public void run() {
        System.out.println("Writing log: " + logMessage + " on " + Thread.currentThread().getName());
    }
}

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(new LogWriter("User1 logged in"));
        executor.submit(new LogWriter("User1 performed action A"));
        executor.submit(new LogWriter("User1 logged out"));

        executor.shutdown();
    }
}
