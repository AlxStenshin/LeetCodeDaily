package day_175;

/**
 * <a href = "https://leetcode.com/problems/maximum-sum-circular-subarray/">
 * 926. Flip String to Monotone Increasing </a>
 * <p>
 * AGiven a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 * <p>
 * A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
 * <p>
 * A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 */

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int maxSubArraySum = kadane(nums);
        if (maxSubArraySum < 0)
            return maxSubArraySum;

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }

        int minSubArraySum = kadane(nums);
        return Math.max(maxSubArraySum, totalSum + minSubArraySum);
    }

    public int kadane(int[] nums) {
        int localMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }

}
