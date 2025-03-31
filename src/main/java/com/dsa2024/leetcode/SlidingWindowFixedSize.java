package com.dsa2024.leetcode;

import java.util.Arrays;

public class SlidingWindowFixedSize {
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            throw new IllegalArgumentException("Array size is smaller than window size.");
        }

        int maxSum = 0;
        int currentSum = 0;
        int startIndex = 0; 

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        // Slide the window over the array
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k]; // Add next element, remove first element of the previous window

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i - k + 1; // Update starting index of the maximum sum subarray
            }
        }

        // Print the subarray
        int[] maxSubarray = Arrays.copyOfRange(arr, startIndex, startIndex + k);
        System.out.println("Subarray with maximum sum: " + Arrays.toString(maxSubarray));

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 8, 1, 5 };
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum(arr, k));
    }
}

