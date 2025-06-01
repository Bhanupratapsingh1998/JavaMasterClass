package com.dsa2024.leetcode.basics_foundations;

public class LengthOfLastWord {

    // Time Complexity: O(n), where n is the length of the string.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;
        // Count characters until next space or start of string
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Helloo World  ";
        int results = lengthOfLastWord(str);
        System.out.println(results);
    }
}
