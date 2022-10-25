package day_090;

/**
 * <a href = "https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">
 * 1662. Check If Two String Arrays are Equivalent </a>
 * <p>
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 */

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1).equals(String.join("", word2)));
    }
}
