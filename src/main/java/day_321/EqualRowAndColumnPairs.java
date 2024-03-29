package day_321;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/equal-row-and-column-pairs/" >
 * 2352. Equal Row and Column Pairs </a>
 * <p>
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
 * <p>
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 */

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int pair = 0;
        int temp = 0;
        int row = 0;

        while (temp <= grid.length - 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < grid.length; j++) {
                map.put(j, grid[row][j]);
            }
            for (int i = 0; i < grid.length; i++) {
                int curr = 0;
                for (int k = 0; k < grid.length; k++) {
                    if (map.get(k) != grid[k][i]) {
                        curr = 0;
                        break;
                    } else
                        curr = 1;
                }
                pair += curr;
            }
            row++;
            temp++;
        }
        return pair;
    }
}
