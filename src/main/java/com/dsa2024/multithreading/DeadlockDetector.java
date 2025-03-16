package com.dsa2024.multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadlockDetector {
    public static void startMonitoring() {
        Thread monitor = new Thread(() -> {
            ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

            while (true) {
                long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();

                if (deadlockedThreads != null) {
                    System.out.println("⚠️ Deadlock detected! Analyzing...");
                    ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreads, true, true);

                    for (ThreadInfo info : threadInfos) {
                        System.out.println("🔴 Deadlocked Thread: " + info.getThreadName());
                        System.out.println("➡️ Waiting for: " + info.getLockName());
                        System.out.println("📌 Locked by: " + info.getLockOwnerName());
                        System.out.println("----------------------------------");
                    }

                    break; // Stop monitoring after detecting a deadlock
                }

                try {
                    Thread.sleep(500); // Check every 500ms
                } catch (InterruptedException ignored) {}
            }
        });

        monitor.setDaemon(true); // Allow JVM to exit even if this thread is running
        monitor.start();
    }
}

