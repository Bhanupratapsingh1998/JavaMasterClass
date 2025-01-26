package com.dsa2024.opps.String;

import java.util.StringJoiner;

public class JoinExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";

        // Join str1, str2, and str3 with a space delimiter
        String result = String.join(" ", str1, str2, str3);
        System.out.println("Joined String: " + result); // Output: "Hello World Java"

        // Join an array of strings with a comma delimiter
        String[] words = { "apple", "banana", "cherry" };
        String joinedWords = String.join(", ", words);
        System.out.println("Joined Array of Strings: " + joinedWords); // Output: "apple, banana, cherry"
    }
}
