package com.dsa2024.leetcode;

public class BinarySearch {
    // Binary Search
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 2, 3 };
        int target = 1;
        System.out.println(binarySearch(arr, target));
    }
}
