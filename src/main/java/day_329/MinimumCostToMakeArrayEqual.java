package day_329;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/minimum-cost-to-make-array-equal/" >
 * 2448. Minimum Cost to Make Array Equal </a>
 * <p>
 * You are given two 0-indexed arrays nums and cost consisting each of n positive integers.
 * <p>
 * You can do the following operation any number of times:
 * <p>
 * Increase or decrease any element of the array nums by 1.
 * The cost of doing one operation on the ith element is cost[i].
 * <p>
 * Return the minimum total cost such that all the elements of the array nums become equal.
 */

public class MinimumCostToMakeArrayEqual {
    public long minCost(int[] nums, int[] cost) {
        long result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], cost[i] + map.getOrDefault(nums[i], 0));
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        long cmin = map.get(min);
        long cmax = map.get(max);
        while (min < max) {
            if (cmin <= cmax) {
                result += cmin;
                min++;
                cmin += map.getOrDefault(min, 0);
            } else {
                result += cmax;
                max--;
                cmax += map.getOrDefault(max, 0);
            }
        }
        return result;
    }
}
