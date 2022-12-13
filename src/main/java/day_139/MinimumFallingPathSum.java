package day_139;

/**
 * <a href="https://leetcode.com/problems/minimum-falling-path-sum/">
 *  931. Minimum Falling Path Sum </a>
 * <p>
 * Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
 * <p>
 * A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
 */

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int size = matrix.length;

        int[][] directions = new int[][]{{1, 1}, {1, 0}, {1, -1}};

        for (int i = size - 2; i >= 0; i--) {
            for (int j = size - 1; j >= 0; j--) {
                int min_sum = Integer.MAX_VALUE;

                for (int[] dir : directions) {
                    int targetRow = i + dir[0];
                    int targetCol = j + dir[1];
                    if (targetRow >= 0 && targetRow < size && targetCol >= 0 && targetCol < size)
                        min_sum = Math.min(min_sum, matrix[targetRow][targetCol]);
                }
                matrix[i][j] = min_sum == Integer.MAX_VALUE ? matrix[i][j] : matrix[i][j] + min_sum;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++)
            res = Math.min(res, matrix[0][i]);
        return res;
    }

}
