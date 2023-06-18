package day_326;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/" >
 * 2328. Number of Increasing Paths in a Grid </a>
 * <p>
 * You are given an m x n integer matrix grid, where you can move from a cell to any adjacent cell in all 4 directions.
 * <p>
 * Return the number of strictly increasing paths in the grid such that you can start from any cell and end at any cell. Since the answer may be very large, return it modulo 109 + 7.
 * <p>
 * Two paths are considered different if they do not have exactly the same sequence of visited cells.
 */

public class NumberOfIncreasingPathsInGrid {
    int mod = (int) (1e9 + 7);

    public int countPaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int paths = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                paths = (paths + solve(grid, i, j, -1, dp)) % mod;
            }
        }

        return paths;
    }

    public int solve(int[][] grid, int i, int j, int prev, int[][] dp) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= prev) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int left = solve(grid, i, j - 1, grid[i][j], dp);
        int right = solve(grid, i, j + 1, grid[i][j], dp);
        int up = solve(grid, i - 1, j, grid[i][j], dp);
        int down = solve(grid, i + 1, j, grid[i][j], dp);

        return dp[i][j] = (1 + left + right + up + down) % mod;
    }
}