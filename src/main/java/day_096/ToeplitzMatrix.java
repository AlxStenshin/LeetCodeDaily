package day_096;

/**
 * <a href = "https://leetcode.com/problems/toeplitz-matrix/">
 * 766. Toeplitz Matrix </a>
 * <p>
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
 * <p>
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 */

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 1; i < rows; i ++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] != matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}
