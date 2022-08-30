package day_034;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a>
 * <p>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 */

public class RotateImage {
    public void rotate(int[][] matrix) {
        int squareSize = matrix.length;
        ArrayList<ArrayList<Integer>> columns = new ArrayList<>();

        for (int i = 0; i < squareSize; i++) {
            ArrayList<Integer> column = new ArrayList<>();
            for (int[] rows : matrix) {
                column.add(rows[i]);
            }
            Collections.reverse(column);
            columns.add(column);
        }

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++)
                matrix[i][j] = columns.get(i).get(j);
        }
    }

}
