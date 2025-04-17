package com.dsa2024.leetcode;

public class MountainArray {

    // 1. Linear Scan Approach
    public static int findPeakIndex(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1; // No peak found
    }

    // 2. Binary Search Approach (Optimized)
    // Both start and end are equal at a time. Hence we can return one of them
    private static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 2 };
        // System.out.println(findPeakIndex(nums));
        System.out.println(peakIndexInMountainArray(nums));

    }
}
