package day_091;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/continuous-subarray-sum/">
 * 523. Continuous Subarray Sum </a>
 * <p>
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
 * <p>
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 */

public class ContinuousSubarraySum {

    public boolean checkSubarraySumHashing(int[] nums, int k) {
        if (nums.length < 2)
            return false;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int rem = currentSum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) {
                    return true;
                }
            }
            map.putIfAbsent(rem, i);
        }
        return false;
    }

    public boolean checkSubarraySumSimplified(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            int sum = nums[i];

            for (int j = i + 1; j < nums.length; ++j) {
                sum += nums[j];
                if (sum % k == 0)
                    return true;
            }
        }
        return false;
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int currentSum = 0;
        int sumElementsCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                currentSum += nums[i+j];
                sumElementsCounter++;

                if ((currentSum % k == 0) && sumElementsCounter > 1)
                    return true;
            }
            currentSum = 0;
            sumElementsCounter = 0;
        }
        return false;
    }
}
