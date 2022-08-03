package day_004;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 307. Range Sum Query - Mutable
 * https://leetcode.com/problems/range-sum-query-mutable/
 *
 * Given an integer array nums, handle multiple queries of the following types:
 *
 * Update the value of an element in nums.
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 *
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * void update(int index, int val) Updates the value of nums[index] to be val.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 */

public class NumArray {

    List<Integer> integers;
    int totalSum;

    public NumArray(int[] nums) {
        integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        totalSum = integers.stream().mapToInt(Integer::intValue).sum();
    }

    public void update(int index, int val) {
        totalSum = totalSum + (val) - integers.get(index);
        integers.set(index, val);
    }

    public int sumRange(int left, int right) {
        List<Integer> range = integers.subList(left, right + 1);
        return range.stream().mapToInt(Integer::intValue).sum();
    }
}

