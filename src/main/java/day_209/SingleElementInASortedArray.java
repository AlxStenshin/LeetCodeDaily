package day_209;

/**
 * <a href = "https://leetcode.com/problems/single-element-in-a-sorted-array/">
 * 540. Single Element in a Sorted Array </a>
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in O(log n) time and O(1) space.
 */

public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (midIndex % 2 == 1) {
                midIndex--;
            }
            if (nums[midIndex] != nums[midIndex + 1]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex + 2;
            }
        }
        return nums[startIndex];
    }
}
