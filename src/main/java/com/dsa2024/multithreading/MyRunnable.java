package com.dsa2024.multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

}

class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
