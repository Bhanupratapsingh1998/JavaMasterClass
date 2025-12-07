package com.dsa2024.leetcode;

public class LongestUniformSubsequence {

    public static int longestUniform(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaabbccccd";
        System.out.println("Longest Uniform Subsequence: " + longestUniform(s));
    }
}
