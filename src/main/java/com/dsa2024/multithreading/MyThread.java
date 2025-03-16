package com.dsa2024.multithreading;

public class MyThread extends Thread {

    //without try-catch
//    @Override
//    public void run() {
//        System.out.println("Thread is running...");
//        int result = 10 / 0; // ❌ This will cause ArithmeticException
//        System.out.println("This line will not execute!");
//    }

    //with try-catch
    public void run() {
        try {
            System.out.println("Thread is running...");
            int result = 10 / 0; // ❌ Exception occurs
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Thread continues running...");
    }
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Main thread continues...");
    }
}

