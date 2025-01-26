package com.dsa2024.jan_24.day06_01_24;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count > 0 && s.charAt(i) == ' ') {
                break;
            } else if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Helloo World  ";
        int results = lengthOfLastWord(str);
        System.out.println(results);
    }
}
