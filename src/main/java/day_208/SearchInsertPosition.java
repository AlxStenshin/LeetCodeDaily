package day_208;

/**
 * <a href = "https://leetcode.com/problems/search-insert-position/">
 * 35. Search Insert Position </a>
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int midIndex;

        while (startIndex <= endIndex) {
            midIndex = startIndex + (endIndex - startIndex) / 2;

            if (nums[midIndex] == target)
                return midIndex;
            else if (nums[midIndex] > target) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return startIndex;
    }
}
