package day_198;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/as-far-from-land-as-possible/" >
 * 1162. As Far from Land as Possible </a>
 * <p>
 * Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land, find a water cell such that its distance to the nearest land cell is maximized, and return the distance. If no land or water exists in the grid, return -1.
 * <p>
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
 */

public class AsFarFromLandAsPossible {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int steps = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] cur = queue.poll();
                steps = Math.max(steps, grid[cur[0]][cur[1]] - 1);

                for (int[] dir : directions) {
                    int x = cur[0] + dir[0], y = cur[1] + dir[1];
                    if ((x >= 0 && x < n) && (y >= 0 && y < n) && (!visited[x][y])) {
                        visited[x][y] = true;
                        grid[x][y] = grid[cur[0]][cur[1]] + 1;
                        queue.offer(new int[]{x, y});
                    }
                }
                size--;
            }
        }
        return steps == 0 ? -1 : steps;
    }
}
