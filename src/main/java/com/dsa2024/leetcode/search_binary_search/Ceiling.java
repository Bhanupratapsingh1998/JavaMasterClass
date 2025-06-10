package com.dsa2024.leetcode.search_binary_search;

public class Ceiling {

    /**
     * This method finds the ceiling of a target value in a sorted array.
     * The ceiling is the smallest element in the array that is greater than or
     * equal to the target.
     *
     * @param nums   The sorted array of integers.
     * @param target The target value to find the ceiling for.
     * @return The index of the ceiling element, or -1 if no such element exists.
     */

    // Time Complexity: O(log n), where n is the number of elements in the array.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static int ceiling(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 13;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}
