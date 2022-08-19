package day_07;

/**
 * 704 Binary Search
 * https://leetcode.com/problems/binary-search/
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int indexLow = 0;
        int indexHigh = nums.length - 1;

        while (indexLow <= indexHigh) {
            int indexMid = (indexLow + indexHigh) / 2;
            if (nums[indexMid] == target)
                return indexMid;

            else if (target > nums[indexMid])
                indexLow = indexMid + 1;
            else
                indexHigh = indexMid - 1;
        }
        return -1;
    }
}
