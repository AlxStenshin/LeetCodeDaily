package day_328;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/k-radius-subarray-averages/" >
 * 2090. K Radius Subarray Averages </a>
 * <p>
 * You are given a 0-indexed array nums of n integers, and an integer k.
 * <p>
 * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.
 * <p>
 * Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
 * <p>
 * The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.
 */

public class RadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int size = nums.length;
        int windowSize = 2 * k + 1;

        long windowSum = 0;
        int[] result = new int[size];
        Arrays.fill(result, -1);

        if (size < windowSize) return result;


        for (int i = 0; i < size; ++i) {
            windowSum += nums[i];

            if (i - windowSize >= 0) {
                windowSum -= nums[i - windowSize];
            }

            if (i >= windowSize - 1) {
                result[i - k] = (int) (windowSum / windowSize);
            }
        }
        return result;
    }
}
