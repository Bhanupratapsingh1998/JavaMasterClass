package com.dsa2024.multithreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,
            () -> System.out.println("All players ready. Game starts!")
        );

        Runnable player = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " ready");
                Thread.sleep(1000);
                barrier.await(); // wait for others
                System.out.println(Thread.currentThread().getName() + " playing");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(player, "Player 1").start();
        new Thread(player, "Player 2").start();
        new Thread(player, "Player 3").start();
    }
}
