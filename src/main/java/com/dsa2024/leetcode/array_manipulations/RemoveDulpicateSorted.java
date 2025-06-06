package com.dsa2024.leetcode.array_manipulations;

import java.util.HashSet;

public class RemoveDulpicateSorted {

    /*
     * Brute Force
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    /*
     * Optimal Approach
     * Two pointers
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static int removeDuplicates1(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 3, 5 };
        int k = removeDuplicates1(arr);
        // int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
