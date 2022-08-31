package day_035;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pacific-atlantic-water-flow/">417. Pacific Atlantic Water Flow</a>
 * <p>
 * There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean.
 * The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
 * <p>
 * The island is partitioned into a grid of square cells.
 * You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
 * <p>
 * The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west
 * if the neighboring cell's height is less than or equal to the current cell's height.
 * Water can flow from any cell adjacent to an ocean into the ocean.
 * <p>
 * Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water
 * can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
 */

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights[0].length;
        int n = heights.length;

        int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        int[][] pacific = new int[n][m];
        int[][] atlantic = new int[n][m];

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int r1 = getAllPacific(heights, dir, i, j, new boolean[n][m], pacific);
                pacific[i][j] = r1;
                int r2 = getAllAtlantic(heights, dir, i, j, new boolean[n][m], atlantic);
                atlantic[i][j] = r2;
                if (r1 == 1 && r2 == 1) {
                    List<Integer> tlist = new ArrayList<>();
                    tlist.add(i);
                    tlist.add(j);
                    list.add(tlist);
                }
            }
        }

        return list;
    }

    public int getAllPacific(int[][] heights, int[][] dir, int i, int j, boolean[][] visited, int[][] pacific) {
        if (pacific[i][j] != 0) {
            return pacific[i][j];
        }

        if (i == 0 || j == 0)
            return 1;

        int res = -1;
        for (int[] d : dir) {
            int dx = d[0] + i;
            int dy = d[1] + j;
            if (dx >= 0 && dy >= 0 && dx < heights.length && dy < heights[0].length &&
                    heights[dx][dy] <= heights[i][j] && !visited[dx][dy]) {
                visited[dx][dy] = true;
                res = Math.max(res, getAllPacific(heights, dir, dx, dy, visited, pacific));
            }
        }

        return res;
    }

    public int getAllAtlantic(int[][] heights, int[][] dir, int i, int j, boolean[][] visited, int[][] atlantic) {
        if (atlantic[i][j] != 0)
            return atlantic[i][j];

        if (i == heights.length - 1 || j == heights[0].length - 1)
            return 1;

        int res = -1;
        for (int[] d : dir) {
            int dx = d[0] + i;
            int dy = d[1] + j;
            if (dx >= 0 && dy >= 0 && dx < heights.length && dy < heights[0].length &&
                    heights[dx][dy] <= heights[i][j] && !visited[dx][dy]) {
                visited[i][j] = true;
                res = Math.max(res, getAllAtlantic(heights, dir, dx, dy, visited, atlantic));
            }
        }

        return res;
    }
}
