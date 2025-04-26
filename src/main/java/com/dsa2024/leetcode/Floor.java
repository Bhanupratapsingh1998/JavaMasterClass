package com.dsa2024.leetcode;

public class Floor {
    /**
     * This method finds the floor of a target value in a sorted array.
     * The floor is the largest element in the array that is less than or equal to
     * the target.
     *
     * @param nums   The sorted array of integers.
     * @param target The target value to find the floor for.
     * @return The index of the floor element, or -1 if no such element exists.
     */

    // Time Complexity: O(log n), where n is the number of elements in the array.
    // Space Complexity: O(1), as we are using a constant amount of space.
    public static int floor(int[] nums, int target) {
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 13;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
}
