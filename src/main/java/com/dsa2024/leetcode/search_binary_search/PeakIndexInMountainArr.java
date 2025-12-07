package com.dsa2024.leetcode.search_binary_search;

public class PeakIndexInMountainArr {
    // 1. Linear Scan Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findPeakIndex(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1; // No peak found
    }

    // 2. Binary Search Approach (Optimized)
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // Both start and end are equal at a time. Hence we can return one of them
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2 };
        // System.out.println(findPeakIndex(arr));
        System.out.println(peakIndexInMountainArray(arr)); // prints 2
    }
}
