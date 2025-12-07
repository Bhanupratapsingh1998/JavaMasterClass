package com.dsa2024.leetcode.basics_foundations;

import java.util.HashMap;

public class ValidAnagram {
    /**
     * Time Complexity: O(n), where n is the length of the strings.
     * Space Complexity: O(1), since we are using a fixed-size map for character
     * counts.
     */
    public static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replace("\\s", "").toLowerCase();
        s2 = s2.replace("\\s", "").toLowerCase();

        // Length check
        if (s1.length() != s2.length())
            return false;

        // Create frequency array for 26 letters
        int[] freq = new int[26];

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Decrease count for second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // If any value != 0 → Not anagram
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "deer";
        String target = "reed";
        System.out.println(isValidAnagram(str, target));
        System.out.println(isAnagram(str, target));
    }
}
