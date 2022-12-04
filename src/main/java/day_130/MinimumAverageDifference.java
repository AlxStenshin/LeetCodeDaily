package day_130;

/**
 * <a href = "https://leetcode.com/problems/minimum-average-difference/">
 * 2256. Minimum Average Difference </a>
 * <p>
 * You are given a 0-indexed integer array nums of length n.
 * <p>
 * The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.
 * <p>
 * Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.
 * <p>
 * Note:<br>
 * The absolute difference of two numbers is the absolute value of their difference.<br>
 * The average of n elements is the sum of the n elements divided (integer division) by n.<br>
 * The average of 0 elements is considered to be 0.
 */

public class MinimumAverageDifference {
    public int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE;
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int leftIndex = 0;
        int resultIndex = -1;
        long prefixSum = 0;

        while (leftIndex < nums.length) {
            prefixSum += nums[leftIndex];
            long leftAverage = prefixSum / (leftIndex + 1);
            long sumRight = sum - prefixSum;
            if (sumRight != 0) sumRight /= nums.length - leftIndex - 1;
            long res = Math.abs(leftAverage - sumRight);
            if (res < min) {
                min = res;
                resultIndex = leftIndex;
            }
            leftIndex++;
        }
        return resultIndex;
    }
}
