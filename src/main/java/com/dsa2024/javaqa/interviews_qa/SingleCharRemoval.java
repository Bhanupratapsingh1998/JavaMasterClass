package com.dsa2024.javaqa.interviews_qa;

import java.util.*;

public class SingleCharRemoval {

    public static void main(String[] args) {

        // Test cases
        System.out.println(findRemovableIndices("abcde", "abde")); // [2]
        System.out.println(findRemovableIndices("aab", "ab"));     // [0, 1]
        System.out.println(findRemovableIndices("abcd", "abc"));   // [3]
        System.out.println(findRemovableIndices("abc", "xyz"));    // [-1]
    }

    /**
     * Finds all indices in the source string such that removing
     * the character at that index results in the target string.
     *
     * @param source the original string
     * @param target the string after one character removal
     * @return list of valid removable indices or [-1] if none exist
     */
    public static List<Integer> findRemovableIndices(String source, String target) {

        // source must be exactly one character longer than target
        if (source.length() != target.length() + 1) {
            return List.of(-1);
        }

        List<Integer> indices = new ArrayList<>();
        int sourceLen = source.length();
        int targetLen = target.length();

        // Step 1: Find longest common prefix
        int prefixLength = 0;
        while (prefixLength < targetLen &&
               source.charAt(prefixLength) == target.charAt(prefixLength)) {
            prefixLength++;
        }

        // Step 2: Find longest common suffix
        int suffixLength = 0;
        while (suffixLength < targetLen &&
               source.charAt(sourceLen - 1 - suffixLength) ==
               target.charAt(targetLen - 1 - suffixLength)) {
            suffixLength++;
        }

        // Step 3: Collect all valid removable indices
        for (int i = targetLen - suffixLength; i <= prefixLength; i++) {
            indices.add(i);
        }

        return indices.isEmpty() ? List.of(-1) : indices;
    }
}

