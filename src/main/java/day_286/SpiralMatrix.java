package day_286;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/matrix-diagonal-sum/" >
 * 54. Spiral Matrix </a>
 * <p>
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        int totalCount = rows * cols;
        int startRow = 0;
        int endRow = rows - 1;
        int startCol = 0;
        int endCol = cols - 1;

        while (count < totalCount) {
            for (int i = startCol; count < totalCount && i <= endCol; i++) {
                result.add(matrix[startRow][i]);
                count++;
            }
            startRow++;

            for (int i = startRow; count < totalCount && i <= endRow; i++) {
                result.add(matrix[i][endCol]);
                count++;
            }
            endCol--;

            for (int i = endCol; count < totalCount && i >= startCol; i--) {
                result.add(matrix[endRow][i]);
                count++;
            }
            endRow--;

            for (int i = endRow; count < totalCount && i >= startRow; i--) {
                result.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }
        return result;
    }
}
