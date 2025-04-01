package com.dsa2024.leetcode;

/*
 * Time Complexity: 𝑂(𝑚×𝑛)
 * Space Complexity: 𝑂(𝑚×𝑛) (can be optimized to 𝑂(𝑛)
*/
public class LCSWithSubstring {
    public static String findLCS(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Step 1: Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Trace back to find the LCS string
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                lcs.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString(); // Reverse since we built it backwards
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";

        String lcs = findLCS(text1, text2);
        System.out.println("LCS Length: " + lcs.length());
        System.out.println("LCS String: " + lcs);
    }
}
