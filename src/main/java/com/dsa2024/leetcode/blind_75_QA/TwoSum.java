package com.dsa2024.leetcode.blind_75_QA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * twoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int nums[] = { 2, 6, 5, 8, 11 };
        int target = 7;
        int results[] = getTwoSumFirst(nums, target);
        // int results[] = getTwoSumSecond(nums, target);
        // int results[] = twoSumHashing(nums, target);
        System.out.println(Arrays.toString(results));
    }

    // This is a brute force approach with O(n^2) time complexity
    // and O(1) space complexity.
    private static int[] getTwoSumFirst(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    /* Two pointer approach should be used in the sorted array */
    // This is a two pointer approach with O(n) time complexity
    // and O(1) space complexity.
    private static int[] getTwoSumSecond(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] { i, j };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] { -1, -1 };
    }

    // This is a hashing approach with O(n) time complexity
    // and O(n) space complexity.
    private static int[] twoSumHashing(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}