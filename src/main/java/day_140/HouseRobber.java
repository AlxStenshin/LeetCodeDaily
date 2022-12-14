package day_140;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/house-robber/">
 * 198. House Robber </a>
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {
    public int rob(int[] nums) {
        int var1 = 0;
        int var2 = 0;

        for (int num : nums) {
            int temp = var1;
            var1 = Math.max(var1, num + var2);
            var2 = temp;
        }
        return var1;
    }
}
