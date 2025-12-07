package com.dsa2024.leetcode;

import java.util.*;

public class ValidBrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack empty → invalid
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                // Check correct matching pair
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty at end → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        if (isValid(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
