package com.dsa2024.multithreading.executor_service;

import com.google.common.util.concurrent.*;

import java.util.concurrent.*;

public class ImageProcessor {
    public static void main(String[] args) {
        ListeningExecutorService executor = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(2));

        ListenableFuture<String> future = executor.submit(() -> {
            Thread.sleep(2000);  
            return "Thumbnail generated!";
        });

        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println(result);
            }

            @Override
            public void onFailure(Throwable t) {
                System.err.println("Error: " + t.getMessage());
            }
        }, Executors.newSingleThreadExecutor());

        System.out.println("Uploading image...");

        executor.shutdown();
    }
}
