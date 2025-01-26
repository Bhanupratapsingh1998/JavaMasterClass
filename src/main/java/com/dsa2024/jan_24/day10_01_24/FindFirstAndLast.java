package com.dsa2024.jan_24.day10_01_24;

import java.util.Arrays;

public class FindFirstAndLast {
    public static int[] searchRange(int nums[], int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int search(int[] nums, int target, boolean findtargetIndex) {
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findtargetIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int results[] = searchRange(nums, target);
        System.out.println(Arrays.toString(results));
    }
}