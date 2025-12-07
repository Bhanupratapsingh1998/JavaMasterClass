package com.dsa2024.leetcode;

public class LongestUniformSubstring {

    public static String longestUniformSubstring(String s) {
        if (s == null || s.length() == 0)
            return "";

        int maxLen = 1;
        int currentLen = 1;
        int maxStartIndex = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            } else {
                currentLen = 1;
            }

            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxStartIndex = i - currentLen + 1;
            }
        }

        return s.substring(maxStartIndex, maxStartIndex + maxLen);
    }

    public static void main(String[] args) {
        String input = "aabceebeee ";
        System.out.println("Longest Uniform Substring: " + longestUniformSubstring(input));
    }
}
