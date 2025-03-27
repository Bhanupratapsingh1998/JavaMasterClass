package com.dsa2024.multithreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads,
                () -> System.out.println("All parties have arrived, proceeding..."));

        for (int i = 0; i < numberOfThreads; i++) {
            Thread worker = new Thread(new Task(barrier));
            worker.start();
        }
    }
}

class Task implements Runnable {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier...");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
