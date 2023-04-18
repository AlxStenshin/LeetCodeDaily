package day_265;

/**
 * <a href = "https://leetcode.com/problems/validate-stack-sequences/">
 * 1768. Merge Strings Alternately </a>
 * <p>
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 */

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int firstPointer = 0;
        int secondPointer = 0;
        while (firstPointer < word1.length() && secondPointer < word2.length()) {
            merged.append(word1.charAt(firstPointer++));
            merged.append(word2.charAt(secondPointer++));
        }

        merged.append(word1.substring(firstPointer));
        merged.append(word2.substring(secondPointer));

        return merged.toString();
    }
}
