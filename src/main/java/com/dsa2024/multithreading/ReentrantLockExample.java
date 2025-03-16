package com.dsa2024.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource3 {
    private final ReentrantLock lock = new ReentrantLock();

    public void doWork() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is executing.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Always unlock to prevent deadlocks
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource3 obj = new SharedResource3();
        Thread t1 = new Thread(obj::doWork, "Thread-1");
        Thread t2 = new Thread(obj::doWork, "Thread-2");

        t1.start();
        t2.start();
    }
}
