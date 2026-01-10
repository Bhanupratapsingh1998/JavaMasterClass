package com.dsa2024.javaqa.interviews_qa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println(
                    "Task " + taskId + " executed by " + Thread.currentThread().getName()
                );
            });
        }

        executorService.shutdown();
    }
}

