package com.dsa2024.leetcode;

public class CheckArraySorted {
    public static boolean checkSorted(int arr[]) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 9, 11, 23 };
        boolean result = checkSorted(arr);
        System.out.println("Is sorted : " + result);
    }
}
