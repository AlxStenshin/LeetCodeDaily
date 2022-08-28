package day_032;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 1329. Sort the Matrix Diagonally
 *
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row
 * or leftmost column and going in the bottom-right direction until reaching the matrix's end.
 * For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix,
 * includes cells mat[2][0], mat[3][1], and mat[4][2].
 *
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
 */

public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (diagonals.containsKey(i - j)) {
                    diagonals.get(i - j).add(mat[i][j]);
                } else {
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.add(mat[i][j]);
                    diagonals.put(i - j, pq);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = diagonals.get(i - j).poll();
            }
        }

        return mat;
    }
}
