package com.dsa2024.javaqa.interviews_qa;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharactersFinder {

    public static void main(String[] args) {

        UniqueCharactersFinder finder = new UniqueCharactersFinder();
        Set<Character> uniqueChars = finder.findUniqueCharacters("AAAABBBBBVVVVVDDDDDSAAAA");

        uniqueChars.forEach(ch -> System.out.print(ch + " "));
        System.out.println("\nCount: " + uniqueChars.size());
    }

    public Set<Character> findUniqueCharacters(String str) {

        Set<Character> uniqueSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            uniqueSet.add(ch);
        }
        return uniqueSet;
    }

    public Set<Character> findUniqueCharactersWithStream(String str) {

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
    }
}
