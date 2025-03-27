package com.dsa2024.multithreading.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatMessageProcessor implements Runnable {
    private final int messageId;

    public ChatMessageProcessor(int messageId) {
        this.messageId = messageId;
    }

    @Override
    public void run() {
        System.out.println("Processing chat message " + messageId + " on " + Thread.currentThread().getName());
    }
}

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            executor.submit(new ChatMessageProcessor(i));
        }

        executor.shutdown();
    }
}
