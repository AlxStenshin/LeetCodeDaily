package day_193;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/find-all-anagrams-in-a-string/">
 * 438. Find All Anagrams in a String </a>
 * <p>
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

public class FindAllAnagramsInAString {

    int[] targetDict = new int[26];

    public List<Integer> findAnagrams(String s, String p) {
        targetDict = buildDict(p);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(s.substring(i, i + p.length())))
                result.add(i);
        }

        return result;
    }

    boolean isAnagram(String source) {
        int[] sourceDict = buildDict(source);
        return Arrays.equals(targetDict, sourceDict);
    }

    int[] buildDict(String s) {
        int[] dict = new int[26];
        for (char c : s.toCharArray()) {
            dict[c - 'a']++;
        }
        return dict;
    }

}
