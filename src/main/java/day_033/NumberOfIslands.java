package day_033;

/**
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 *
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // find a cell belong to an island, then clear whole island and increase count
                if (grid[i][j] == '1') {
                    clear(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void clear(int i, int j, char[][] grid) {
        //array edge detect
        if (i < 0 || i >= grid.length) {
            return;
        }
        if (j < 0 || j >= grid[i].length) {
            return;
        }

        //island edge detect
        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        clear(i + 1, j, grid);
        clear(i - 1, j, grid);
        clear(i, j + 1, grid);
        clear(i, j - 1, grid);
    }
}
