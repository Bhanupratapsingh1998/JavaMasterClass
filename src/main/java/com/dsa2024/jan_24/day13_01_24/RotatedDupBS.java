package com.dsa2024.jan_24.day13_01_24;

public class RotatedDupBS {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));
    }

    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                start++;
                end--;
            }
            // target is in first half
            else if (nums[start] <= nums[mid]) {
                if ((nums[start] <= target) && (nums[mid] > target)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // target is in second half
            else {
                if ((nums[mid] < target) && (nums[end] >= target)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
