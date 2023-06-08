package day_316;

/**
 * <a href = "https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/" >
 * 1351. Count Negative Numbers in a Sorted Matrix </a>
 * <p>
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
 */

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int cols = grid[0].length;
        for (int[] ints : grid) {
            int left = 0;
            int right = cols - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (ints[mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            count += cols - left;
        }
        return count;
    }
}
