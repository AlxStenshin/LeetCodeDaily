package day_151;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/longest-subsequence-with-limited-sum/">
 * 2389. Longest Subsequence With Limited Sum </a>
 * <p>
 * You are given an integer array nums of length n, and an integer array queries of length m.
 * <p>
 * Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].
 * <p>
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */

public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int count = 0;
            int value = queries[i];

            for (int num : nums) {
                if (value >= num) {
                    count++;
                    value -= num;
                }
                else break;
            }
            result[i] = count;
        }
        return result;
    }
}
