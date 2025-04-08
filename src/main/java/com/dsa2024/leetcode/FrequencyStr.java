package com.dsa2024.leetcode;

import java.util.HashMap;

public class FrequencyStr {
    private static void getFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    private static void getFrequencyWithOutMap(String str) {
        int[] freq = new int[128]; // Supports standard ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abz12!1fas";
        // getFrequency(str);
        getFrequencyWithOutMap(str);
    }

}
