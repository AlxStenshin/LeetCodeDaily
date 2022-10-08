package day_073;

import java.util.Arrays;
/**
 * <a href=https://leetcode.com/problems/3sum-closest/">
 *   16. 3Sum Closest</a>
 * <p>
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * <p>
 * Return the sum of the three integers.
 */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }

                if (sum > target)
                    right--;
                else
                    left++;
            }
        }
        return (target - diff);
    }
}
