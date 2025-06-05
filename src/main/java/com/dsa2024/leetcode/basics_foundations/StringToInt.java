package com.dsa2024.leetcode.basics_foundations;

public class StringToInt {
    /**
     * This method converts a string to an integer, handling leading whitespace,
     * optional sign, and overflow conditions.
     *
     * @param s the input string
     * @return the converted integer
     */
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int result = 0;
        int sign = 1;

        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle optional sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Process digits and build the number
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Check for overflow before adding digit
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        StringToInt obj = new StringToInt();
        String str = " -42";
        // String str = "words and 987";
        int result = obj.myAtoi(str);
        System.out.println(result); // Output: -42
    }
}
