package day_089;

import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/">
 * 1239. Maximum Length of a Concatenated String with Unique Characters</a>
 * <p>
 * You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.
 * <p>
 * Return the maximum possible length of s.
 * <p>
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    int max = 0;

    public int maxLength(List<String> arr) {
        backTrack(arr, "", 0);
        return max;
    }

    private void backTrack(List<String> arr, String current, int start) {
        if (max < current.length())
            max = current.length();
        for (int i = start; i < arr.size(); i++) {
            if (!isValid(current, arr.get(i)))
                continue;

            backTrack(arr, current + arr.get(i), i + 1);
        }
    }

    private boolean isValid(String currentString, String newString) {
        int[] array = new int[26];

        for (int i = 0; i < newString.length(); i++) {
            if (++array[newString.charAt(i) - 'a'] == 2)
                return false;

            if (currentString.contains(newString.charAt(i) + ""))
                return false;
        }
        return true;
    }
}

