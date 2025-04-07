package com.dsa2024.leetcode;

public class LCSWithoutDP {

    public static String findLCS(String text1, String text2) {
        return findLCSHelper(text1, text2, text1.length(), text2.length());
    }

    private static String findLCSHelper(String s1, String s2, int m, int n) {
        // Base case
        if (m == 0 || n == 0) return "";

        // If last characters match
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return findLCSHelper(s1, s2, m - 1, n - 1) + s1.charAt(m - 1);
        }

        // If last characters don't match
        String lcs1 = findLCSHelper(s1, s2, m - 1, n);
        String lcs2 = findLCSHelper(s1, s2, m, n - 1);

        return (lcs1.length() > lcs2.length()) ? lcs1 : lcs2;
    }

    public static void main(String[] args) {
        String text1 = "abedec";
        String text2 = "ace";

        String lcs = findLCS(text1, text2);
        System.out.println("LCS Length: " + lcs.length());
        System.out.println("LCS String: " + lcs);
    }
}
