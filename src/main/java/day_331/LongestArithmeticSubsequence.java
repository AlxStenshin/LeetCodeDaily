package day_331;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/longest-arithmetic-subsequence/" >
 * 1027. Longest Arithmetic Subsequence </a>
 * <p>
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 * <p>
 * Note that:
 * <p>
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 * A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 */

public class LongestArithmeticSubsequence {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n <= 2)
            return n;

        int longest = 2;
        Map<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1);
                longest = Math.max(longest, dp[i].get(diff));
            }
        }
        return longest;
    }
}
