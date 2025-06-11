package com.dsa2024.leetcode.search_binary_search;

public class SmallestLetter {
    // Given a characters array letters that is sorted in non-decreasing order and a
    // character target, return the smallest character in the array that is larger
    // than target.
    // Note that the letters wrap around. For example, if target == 'z' and letters
    // == ['a', 'b'], the answer is 'a'.

    // Time Complexity: O(log n), where n is the number of elements in the array.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';
        char results = nextGreatestLetter(letters, target);
        System.out.println(results);
    }
}
