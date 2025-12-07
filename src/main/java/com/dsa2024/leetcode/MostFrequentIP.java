package com.dsa2024.leetcode;

import java.util.*;

public class MostFrequentIP {

    public static String getMostFrequentIP(List<String> logs) {
        Map<String, Integer> freqMap = new HashMap<>();

        // Count frequency of each IP
        for (String log : logs) {
            String ip = log.split(" ")[0]; // IP is always first token
            freqMap.put(ip, freqMap.getOrDefault(ip, 0) + 1);
        }

        int maxCount = Collections.max(freqMap.values());

        // Collect all IPs with maxCount
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        // If multiple, return sorted comma-separated string
        Collections.sort(result);
        return String.join(",", result);
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20");

        System.out.println(getMostFrequentIP(logs)); // Output: 10.0.0.1
    }
}
