package day_344;

/**
 * <a href = "https://leetcode.com/problems/minimum-size-subarray-sum/" >
 * 209. Minimum Size Subarray Sum </a>
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
