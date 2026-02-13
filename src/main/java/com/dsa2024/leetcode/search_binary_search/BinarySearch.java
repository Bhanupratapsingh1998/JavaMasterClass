package com.dsa2024.leetcode.search_binary_search;

public class BinarySearch {
    // Binary Search
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
}
