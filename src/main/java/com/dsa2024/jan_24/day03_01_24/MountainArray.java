package com.dsa2024.jan_24.day03_01_24;

public class MountainArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 2 };
        System.out.println(peakIndexInMountainArray(nums));
    }

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
}
