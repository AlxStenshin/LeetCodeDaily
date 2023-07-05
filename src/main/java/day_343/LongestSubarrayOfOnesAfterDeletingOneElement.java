package day_343;

/**
 * <a href = "https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/" >
 * 1493. Longest Subarray of 1's After Deleting One Element </a>
 * <p>
 * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int zeros = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1 - zeros);
        }
        return (ans == n) ? ans - 1 : ans;
    }
}
