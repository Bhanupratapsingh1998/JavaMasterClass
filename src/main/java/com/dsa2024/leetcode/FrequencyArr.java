package com.dsa2024.leetcode;

import java.util.HashMap;

public class FrequencyArr {
    private static void getFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println("most time repeated num is : " + key);
            }
        }
        // map.forEach((key, value) -> System.out.println(key + " -> " + value));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        getFrequency(arr);
    }
}
