package com.dsa2024.leetcode.array_manipulations;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2 };
        System.out.println(search(arr));
        // System.out.println(findPivotWithDuplicates(arr));
    }

    static int search(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
