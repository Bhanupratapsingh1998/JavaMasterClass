package com.dsa2024.jan_24.day04_01_24;

public class firstUniqChar {
    public static int getFirstUniqChar(String s) {
        String str = s;
        char[] charArray = str.toCharArray();
        int len = charArray.length;

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        int results = getFirstUniqChar(str);
        System.out.println(results);
    }
}
