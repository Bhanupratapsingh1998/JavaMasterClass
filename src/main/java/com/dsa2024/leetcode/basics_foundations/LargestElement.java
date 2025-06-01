package com.dsa2024.leetcode.basics_foundations;

public class LargestElement {
    // Time Complexity: O(n), where n is the number of elements in the array.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static int largest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input: array is null or empty.");
        }
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 1 };
        int result = largest(arr);
        System.out.println("The largest element is : " + result);
    }
}
