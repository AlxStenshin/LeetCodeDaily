package day_287;

/**
 * <a href = "https://leetcode.com/problems/spiral-matrix-ii/" >
 * 59. Spiral Matrix II </a>
 * <p>
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.There is a function signFunc(x) that returns:
 */

public class SpiralMatrixTwo {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[0][0];
        }

        int[][] result = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int currentValue = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[top][i] = currentValue++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = currentValue++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = currentValue++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = currentValue++;
                }
                left++;
            }

        }
        return result;
    }
}
