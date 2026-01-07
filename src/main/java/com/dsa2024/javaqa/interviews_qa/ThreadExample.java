package com.dsa2024.javaqa.interviews_qa;

public class ThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Runnable Thread");
        });

        thread.start();  
    }
}

