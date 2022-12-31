package day_157;

/**
 * <a href = "https://leetcode.com/problems/unique-paths-iii/">
 * 980. Unique Paths III </a>
 * <p>
 * You are given an m x n integer array grid where grid[i][j] could be:
 * <p>
 * 1 representing the starting square. There is exactly one starting square.<br>
 * 2 representing the ending square. There is exactly one ending square.<br>
 * 0 representing empty squares we can walk over.<br>
 * -1 representing obstacles that we cannot walk over.<br>
 * <p>
 * Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
 */

public class UniquePathsThree {

    public int uniquePathsIII(int[][] grid) {
        int totalZeros = 0, startX = 0, startY = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    totalZeros++;

                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        return DFS(grid, startX, startY, totalZeros, 0);
    }

    private int DFS(int[][] obstacleGrid, int i, int j, int totalZeros, int currentZeros) {

        if (i < 0 || i >= obstacleGrid.length || j < 0 || j >= obstacleGrid[0].length)
            return 0;

        if (obstacleGrid[i][j] == -1)
            return 0;

        if (obstacleGrid[i][j] == 2 && totalZeros == currentZeros - 1)
            return 1;

        else if (obstacleGrid[i][j] == 2)
            return 0;

        obstacleGrid[i][j] = -1;
        int totalPaths =
                DFS(obstacleGrid, i + 1, j, totalZeros, currentZeros + 1) +
                DFS(obstacleGrid, i - 1, j, totalZeros, currentZeros + 1) +
                DFS(obstacleGrid, i, j + 1, totalZeros, currentZeros + 1) +
                DFS(obstacleGrid, i, j - 1, totalZeros, currentZeros + 1);

        obstacleGrid[i][j] = 0;
        return totalPaths;
    }

}
