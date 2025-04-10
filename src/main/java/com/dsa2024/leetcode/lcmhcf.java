package com.dsa2024.leetcode;

public class lcmhcf {
    // HCF(Highest Common Factor also called GCD, Greatest Common Divisor)
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
