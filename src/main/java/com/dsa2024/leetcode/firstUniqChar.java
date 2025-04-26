package com.dsa2024.leetcode;

public class firstUniqChar {
    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int getFirstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }

    // Optimized Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        // Step 2: Count each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Step 3: Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        // System.out.println(getFirstUniqChar(str));
        System.out.println(firstUniqChar("leetcode")); // Output: 0
        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(firstUniqChar("aabb")); // Output: -1
    }
}
