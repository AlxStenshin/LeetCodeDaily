package day_254;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/number-of-enclaves/">
 * 1020. Number of Enclaves </a>
 * <p>
 * You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
 * <p>
 * A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
 * <p>
 * Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
 */

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || j == 0 || i == rows - 1 || j == cols - 1) && grid[i][j] == 1) {
                    dfs(grid, i, j);
                }
            }
        }

        return Arrays.stream(grid).mapToInt(row -> Arrays.stream(row).sum()).sum();
    }

    private void dfs(int[][] grid, int i, int j) {
        grid[i][j] = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (x >= 0 &&
                    y >= 0 &&
                    x < grid.length &&
                    y < grid[0].length
                    && grid[x][y] == 1) {
                dfs(grid, x, y);
            }
        }
    }

}
