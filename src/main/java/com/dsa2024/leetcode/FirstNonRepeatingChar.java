package com.dsa2024.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character found
        return '-';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("apple")); // Output: a
        System.out.println(firstNonRepeatingChar("racecars")); // Output: e
        System.out.println(firstNonRepeatingChar("aabb")); // Output: -
    }
}
