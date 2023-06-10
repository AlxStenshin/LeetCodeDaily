package day_318;

/**
 * <a href = "https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/" >
 * 1802. Maximum Value at a Given Index in a Bounded Array </a>
 * <p>
 * You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:
 * <p>
 * nums.length == n<br>
 * nums[i] is a positive integer where 0 <= i < n.<br>
 * abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.<br>
 * The sum of all the elements of nums does not exceed maxSum.<br>
 * nums[index] is maximized.<br>
 * Return nums[index] of the constructed array.<br>
 * <p>
 * Note that abs(x) equals x if x >= 0, and -x otherwise.*
 */

public class MaximumValueAtAGivenIndexInABoundedArray {

    public int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (check(mid, index, n) <= maxSum) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }

    private long check(long a, int index, int n) {
        long leftOffset = Math.max(a - index, 0);
        long result = (a + leftOffset) * (a - leftOffset + 1) / 2;
        long rightOffset = Math.max(a - ((n - 1) - index), 0);
        result += (a + rightOffset) * (a - rightOffset + 1) / 2;
        return result - a;
    }
}
