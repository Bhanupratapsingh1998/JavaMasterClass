package com.dsa2024.multithreading;

class SharedResource1 {
    private static int count = 0;

    // No synchronization
    public static void increment() {
        count++; // Race condition occurs here
    }

    public static int getCount() {
        return count;
    }
}

public class WithoutSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SharedResource1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SharedResource1.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (without synchronization): " + SharedResource1.getCount());
    }
}

