package day_253;

/**
 * <a href = "https://leetcode.com/problems/number-of-closed-islands/">
 * 1254. Number of Closed Islands </a>
 * <p>
 * Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
 * <p>
 * Return the number of closed islands.
 */

public class NumberOfClosedIslands {

    public int closedIsland(int[][] grid) {
        int cols = grid.length;
        int rows = grid[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if ((i * j == 0 || i == cols - 1 || j == rows - 1) && (grid[i][j] == 0))
                    dfs(i, j, grid);
            }
        }

        int count = 0;
        for (int i = 1; i < cols - 1; i++) {
            for (int j = 1; j < rows - 1; j++) {
                if (grid[i][j] == 0) {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, int[][] grid) {
        int cols = grid.length;
        int rows = grid[0].length;
        if (i < 0 || i >= cols || j < 0 || j >= rows || grid[i][j] != 0)
            return;

        grid[i][j] = 1;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            dfs(nx, ny, grid);
        }
    }

}
