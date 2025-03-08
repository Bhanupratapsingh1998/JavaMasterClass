package com.dsa2024.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Main {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
