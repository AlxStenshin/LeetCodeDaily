package day_283;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/" >
 * 1498. Number of Subsequences That Satisfy the Given Sum Condition </a>
 * <p>
 * You are given an array of integers nums and an integer target.
 * <p>
 * Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.
 */


public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007;
        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for (int i = 1; i <= nums.length; ++i) {
            pre.add((pre.get(i - 1) << 1) % mod);
        }

        Arrays.sort(nums);
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                result = (result + pre.get(right - left++)) % mod;
            }
        }

        return result;
    }
}
