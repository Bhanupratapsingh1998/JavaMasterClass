package com.dsa2024.leetcode;

public class LengthOfLastWord {

    // Time Complexity: O(n), where n is the length of the string.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count > 0 && s.charAt(i) == ' ') {
                break;
            } else if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Helloo World  ";
        int results = lengthOfLastWord(str);
        System.out.println(results);
    }
}
