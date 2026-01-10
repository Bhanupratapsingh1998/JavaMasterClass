package com.dsa2024.javaqa.interviews_qa;

public class CustomThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CustomThreadExample t1 = new CustomThreadExample();
        t1.start();
    }
}

