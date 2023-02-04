package day_192;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/permutation-in-string/">
 * 567. Permutation in String </a>
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] firstStringCharFreq = new int[26];
        int[] secondStringCharFreq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            firstStringCharFreq[s1.charAt(i) - 'a']++;
            secondStringCharFreq[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (Arrays.equals(firstStringCharFreq, secondStringCharFreq))
                return true;

            secondStringCharFreq[s2.charAt(i + s1.length()) - 'a']++;
            secondStringCharFreq[s2.charAt(i) - 'a']--;
        }
        return (Arrays.equals(firstStringCharFreq, secondStringCharFreq));
    }

}
