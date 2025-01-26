package com.dsa2024.may_24.day_12_05_24;

public class CheckSorted {

    // Approach: Brute Force
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // Optimal Approach
    static boolean isSorted1(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 }, n = 5;
        System.out.println(isSorted(arr, n));
        System.out.println(isSorted1(arr, n));

    }
}
