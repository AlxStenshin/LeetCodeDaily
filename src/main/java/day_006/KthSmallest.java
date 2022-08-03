package day_006;

import java.util.Arrays;

/**
 * 378. Kth Smallest Element in a Sorted Matrix
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 *
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order,
 * return the kth smallest element in the matrix.
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * You must find a solution with a memory complexity better than O(n2).
 */

public class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray()[k - 1];
    }

    public int binarySearchSolution(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = n - 1;
            for (int[] ints : matrix) {
                while (j >= 0 && ints[j] > mid) j--;
                count += j + 1;
            }
            if (count < k) low = mid + 1;
            else high = mid;
        }
        return high;
    }
}

