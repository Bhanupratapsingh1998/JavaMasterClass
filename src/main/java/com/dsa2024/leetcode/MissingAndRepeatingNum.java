package com.dsa2024.leetcode;

import java.util.Arrays;

public class MissingAndRepeatingNum {
    public static int[] findMissingNumbers(int[] nums) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                result[0] = index + 1; // Repeating number
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1; // Missing number
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 5, 6, 4 };
        int[] missingNumbers = findMissingNumbers(nums);
        System.out.println(Arrays.toString(missingNumbers)); // Output: [3, 4]
    }
}
