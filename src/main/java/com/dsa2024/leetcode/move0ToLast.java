package com.dsa2024.leetcode;

import java.util.Arrays;

public class move0ToLast {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 4, 0, 0, 11, 23 };
        int result[] = moveZerosToLast(arr);
        System.out.println("Move zero's to last : " + Arrays.toString(result));
    }

    private static int[] moveZerosToLast(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }

        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        return arr;
    }
}
