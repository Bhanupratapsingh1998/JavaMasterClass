package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayListExample {
    public static void main(String[] args) {
        // Create a synchronized (thread-safe) ArrayList
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        // Now the synchronizedList can be safely accessed by multiple threads

        // Create a thread-safe ArrayList
        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();
        // Now the threadSafeList can be safely accessed by multiple threads
    }
}
