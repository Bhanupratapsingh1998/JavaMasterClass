package com.dsa2024.multithreading;

class SharedResource {
    synchronized void process() {
        try {
            System.out.println("Waiting...");
            wait();  // Releases lock and waits
            System.out.println("Resumed after notify()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void wakeUp() {
        notify();  // Notifies waiting thread
    }

    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        new Thread(() -> obj.process()).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        new Thread(() -> obj.wakeUp()).start();
    }
}

