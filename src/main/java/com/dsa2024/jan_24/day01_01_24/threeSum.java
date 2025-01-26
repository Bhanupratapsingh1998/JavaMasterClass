package com.dsa2024.jan_24.day01_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ThreeSome
 */
public class threeSum {

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        List<List<Integer>> results = getThreeSumFirst(nums, target);
        System.out.println(results);
    }

    private static List<List<Integer>> getThreeSumFirst(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}