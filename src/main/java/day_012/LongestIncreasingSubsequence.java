package day_012;

import java.util.TreeMap;

/**
 * 300. Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * <p>
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without
 * changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        TreeMap<Integer, Integer> maxLengths = new TreeMap<>();

        for (int num : nums) {
            int max = maxLengths.subMap(-10_000, num).values().stream().mapToInt(x -> x).max().orElse(0);
            maxLengths.put(num, max + 1);
        }
        return maxLengths.values().stream().mapToInt(x -> x).max().orElse(0);
    }
}
