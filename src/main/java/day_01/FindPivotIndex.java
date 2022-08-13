package day_01;

import java.util.Arrays;

/**
 * 724. Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/
 *
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
 * to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 */

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();

        int leftSum = 0;
        int rightSum = totalSum - nums[0];

        int i = 1;
        while (leftSum != rightSum && i < nums.length) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            i++;
        }

        if (leftSum == rightSum)
            return i - 1;
        else
            return -1;
    }
}
