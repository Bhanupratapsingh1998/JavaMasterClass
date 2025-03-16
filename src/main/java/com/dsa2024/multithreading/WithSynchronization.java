package com.dsa2024.multithreading;

class SharedResource2 {
    private static int count = 0;

    // Synchronized static method
    public static synchronized void increment() {
        count++; // Thread-safe now
    }

    public static synchronized int getCount() {
        return count;
    }
}

public class WithSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                SharedResource2.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                SharedResource2.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (with synchronization): " + SharedResource2.getCount());
    }
}

