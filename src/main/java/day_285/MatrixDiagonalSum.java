package day_285;

/**
 * <a href = "https://leetcode.com/problems/matrix-diagonal-sum/" >
 * 1572. Matrix Diagonal Sum </a>
 * <p>
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 */

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int size = mat.length - 1;
        int result = 0;

        for (int i = 0; i <= size; i++) {
            result += mat[i][i];
            if (size - i != i)
                result += mat[i][size-i];
        }
        return result;
    }

}
