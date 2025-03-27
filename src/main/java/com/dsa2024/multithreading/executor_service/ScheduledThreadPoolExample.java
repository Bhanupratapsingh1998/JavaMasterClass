package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class AutoSaveTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Auto-saving document at " + System.currentTimeMillis());
    }
}

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new AutoSaveTask(), 0, 5, TimeUnit.SECONDS);
    }
}