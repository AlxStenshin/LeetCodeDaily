package day_248;

/**
 * <a href = "https://leetcode.com/problems/binary-search/">
 * 704. Binary Search </a>
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (endIndex + startIndex) / 2;

            if (nums[middleIndex] == target)
                return middleIndex;

            if (target > nums[middleIndex])
                startIndex = middleIndex + 1;
            else
                endIndex = middleIndex - 1;

        }
        return -1;
    }
}
