package day_076;

/**
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/">
 *  334. Increasing Triplet Subsequence</a>
 * <p>
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k)
 * <p>
 * such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 */

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int num : nums) {
            if (num <= firstMin)
                firstMin = num;
            else if (num < secondMin)
                secondMin = num;
            else if (num > secondMin)
                return true;
        }
        return false;
    }
}
