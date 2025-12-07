package com.dsa2024.leetcode.search_binary_search;

// Declare the interface FIRST
interface MountainArray {
    public int get(int index);

    public int length();
}

// Fake MountainArray implementation for local testing
class TestMountainArray implements MountainArray {
    private int[] arr;

    public TestMountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 6, 4, 2 }; // Mountain Array
        int target = 6;

        MountainArray mountainArr = new TestMountainArray(arr);
        FindInMountain sol = new FindInMountain();

        int result = sol.findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + result);
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int peak = findPeakIndex(mountainArr, n);

        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1)
            return index;

        return binarySearch(mountainArr, target, peak, n - 1, false);
    }

    private int findPeakIndex(MountainArray arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) > arr.get(mid + 1))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    private int binarySearch(MountainArray arr, int target, int left, int right, boolean asc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (asc) {
                if (value < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            } else {
                if (value > target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
