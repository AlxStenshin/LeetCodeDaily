package day_352;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/" >
 * 1218. Longest Arithmetic Subsequence of Given Difference </a>
 * <p>
 * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters present in the string. Note the two characters may or may not be the same.
 * <p>
 * Given a string s consisting of lowercase English letters only, return the largest variance possible among all substrings of s.
 * <p>
 * A substring is a contiguous sequence of characters within a string.
 */

public class LongestArithmeticSubsequenceOfGivenDifference {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> m = new HashMap<>();
        int mx = 0;
        for (int c : arr) {
            if (m.containsKey(c - difference))
                m.put(c, m.get(c - difference) + 1);
            else
                m.put(c, 1);
            mx = Math.max(mx, m.get(c));
        }
        return mx;
    }
}
