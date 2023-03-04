package day_220;

/**
 * <a href = "https://leetcode.com/problems/count-subarrays-with-fixed-bounds/">
 * 2444. Count Subarrays With Fixed Bounds </a>
 * <p>
 * You are given an integer array nums and two integers minK and maxK.
 * <p>
 * A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
 * <p>
 * The minimum value in the subarray is equal to minK.<br>
 * The maximum value in the subarray is equal to maxK.<br>
 * Return the number of fixed-bound subarrays.
 * <p>
 * A subarray is a contiguous part of an array.
 **/

public class CountSubarraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long answer = 0;

        // the MOST RECENT positions of minK and maxK.
        int minPosition = -1;
        int maxPosition = -1;

        // the MOST RECENT value outside the range [minK, maxK].
        int leftBound = -1;

        // Iterate over nums, for each number at index i:
        for (int i = 0; i < nums.length; i++) {
            // If the number is outside the range [minK, maxK], update the most recent leftBound.
            if (nums[i] < minK || nums[i] > maxK)
                leftBound = i;

            // If the number is minK or maxK, update the most recent position.
            if (nums[i] == minK)
                minPosition = i;
            if (nums[i] == maxK)
                maxPosition = i;

            // The number of valid subarrays equals the number of elements between leftBound and
            // the smaller of the two most recent positions (minPosition and maxPosition).
            answer += Math.max(0, Math.min(maxPosition, minPosition) - leftBound);
        }
        return answer;
    }
}
