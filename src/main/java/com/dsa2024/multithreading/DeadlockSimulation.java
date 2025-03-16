package com.dsa2024.multithreading;

class Resource {
}

public class DeadlockSimulation {
    private static final Resource res1 = new Resource();
    private static final Resource res2 = new Resource();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 1");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (res2) {
                    System.out.println(Thread.currentThread().getName() + " locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (res1) {
                    System.out.println(Thread.currentThread().getName() + " locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();

        // Start deadlock detection thread
        DeadlockDetector.startMonitoring();
    }
}

