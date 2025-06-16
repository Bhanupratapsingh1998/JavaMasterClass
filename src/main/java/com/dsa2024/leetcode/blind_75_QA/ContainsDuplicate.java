package com.dsa2024.leetcode.blind_75_QA;

import java.util.Arrays;

public class ContainsDuplicate {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static boolean containsDuplicate1(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity: O(n log n) due to sorting
    // Space Complexity: O(1) if we ignore the space used by the sorting algorithm
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));

    }

}
