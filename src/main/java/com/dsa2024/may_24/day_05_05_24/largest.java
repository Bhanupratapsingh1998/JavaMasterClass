package com.dsa2024.may_24.day_05_05_24;

public class largest {
    public static void main(String[] args) {
        int nums[] = { 2, 5, 1, 3, 0 };
        int n = 5;
        int largest = findLargestElement(nums, n);
        System.out.println(largest);
    }

    private static int findLargestElement(int[] nums, int n) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }

        }
        return largest;
    }
}
