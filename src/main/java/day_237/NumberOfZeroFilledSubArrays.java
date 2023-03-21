package day_237;

/**
 * <a href = "https://leetcode.com/problems/number-of-zero-filled-subarrays/">
 * 2348. Number of Zero-Filled Subarrays </a>
 * <p>
 * Given an integer array nums, return the number of subarrays filled with 0.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */

public class NumberOfZeroFilledSubArrays {
    public long zeroFilledSubArray(int[] nums) {
        int result = 0;
        int subArrayLen = 0;

        for (int num : nums) {
            if (num == 0)
                subArrayLen++;
            else
                subArrayLen = 0;
            result += subArrayLen;
        }
        return result;

    }
}
