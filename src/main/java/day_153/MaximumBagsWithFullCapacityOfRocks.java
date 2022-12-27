package day_153;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/">
 *     2279. Maximum Bags With Full Capacity of Rocks </a>
 * <p>
 * You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks. The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.
 * <p>
 * Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
 */

public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] = capacity[i] - rocks[i];
        }

        // Now Capacity stores stone count, requires to full the bag.
        Arrays.sort(capacity);

        int bagIndex = 0;
        while (additionalRocks > 0 && bagIndex < capacity.length) {
            if (capacity[bagIndex] != 0) {
                int diff = Math.min(additionalRocks, capacity[bagIndex]);
                additionalRocks -= diff;
                capacity[bagIndex] -= diff;
            }
            bagIndex++;
        }

        return (int) Arrays.stream(capacity).filter(i -> i == 0).count();
    }
}
