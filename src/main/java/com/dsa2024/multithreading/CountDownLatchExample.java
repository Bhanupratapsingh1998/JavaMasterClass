package com.dsa2024.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Thread worker1 = new Thread(() -> {
            System.out.println("Worker 1 done.");
            latch.countDown(); // Reduce the count by 1
        });

        Thread worker2 = new Thread(() -> {
            System.out.println("Worker 2 done.");
            latch.countDown();
        });

        Thread worker3 = new Thread(() -> {
            System.out.println("Worker 3 done.");
            latch.countDown();
        });

        worker1.start();
        worker2.start();
        worker3.start();

        latch.await(); // Wait until the count becomes zero
        System.out.println("All workers finished. Proceeding further...");
    }
}
