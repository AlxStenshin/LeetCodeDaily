package day_252;

/**
 * <a href = "https://leetcode.com/problems/minimize-maximum-of-array/">
 * 2439. Minimize Maximum of Array </a>
 * <p>
 * You are given a 0-indexed array nums comprising of n non-negative integers.
 * <p>
 * In one operation, you must:
 * <p>
 * Choose an integer i such that 1 <= i < n and nums[i] > 0.<br>
 * Decrease nums[i] by 1.<br>
 * Increase nums[i - 1] by 1.<br>
 * Return the minimum possible value of the maximum integer of nums after performing any number of operations.
 */

public class MinimizeMaximumOfArray {

    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        long result = 0;
        for (int index = 0; index < nums.length; ++index) {
            sum += nums[index];
            result = Math.max(result, (sum + index) / (index + 1));
        }
        return (int) result;
    }

}
