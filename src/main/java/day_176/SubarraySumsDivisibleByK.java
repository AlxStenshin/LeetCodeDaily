package day_176;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/subarray-sums-divisible-by-k/">
 * 974. Subarray Sums Divisible by K </a>
 * <p>
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 * <p>
 * A subarray is a contiguous part of an array.
 */

public class SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                nums[i] += nums[i - 1];

            // Take modulo twice to avoid negative remainders.
            int divisionRemainder = (nums[i] % k + k) % k;
            map.put(divisionRemainder, map.getOrDefault(divisionRemainder, 0) + 1);
        }

        int result = map.getOrDefault(0, 0);
        for (int frequency : map.values())
            result += frequency * (frequency - 1) / 2;

        return result;
    }
}
