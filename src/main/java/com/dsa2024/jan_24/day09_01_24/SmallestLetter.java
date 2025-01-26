package com.dsa2024.jan_24.day09_01_24;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';
        char results = nextGreatestLetter(letters, target);
        System.out.println(results);
    }

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
}
