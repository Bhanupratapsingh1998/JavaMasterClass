package com.dsa2024.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // 2 permits available

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Worker(semaphore));
            t.start();
        }
    }
}

class Worker implements Runnable {
    private Semaphore semaphore;

    public Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " trying to acquire permit...");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired permit. Working...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " done. Releasing permit.");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
