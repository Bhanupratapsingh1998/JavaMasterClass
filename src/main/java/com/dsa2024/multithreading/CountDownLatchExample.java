package com.dsa2024.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable service = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " started");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown(); // reduce count
            }
        };

        new Thread(service, "DB Service").start();
        new Thread(service, "Cache Service").start();
        new Thread(service, "API Service").start();

        latch.await(); // wait until count = 0
        System.out.println("All services are up. Application started.");
    }
}
