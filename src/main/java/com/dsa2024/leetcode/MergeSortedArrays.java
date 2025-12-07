package com.dsa2024.leetcode;

public class MergeSortedArrays {

    public static int[] mergeSorted(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] result = mergeSorted(arr1, arr2);

        System.out.print("Merged Sorted Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
