package day_309;

import java.util.ArrayDeque;

/**
 * <a href = "https://leetcode.com/problems/shortest-path-in-binary-matrix/" >
 * 1091. Shortest Path in Binary Matrix </a>
 * <p>
 * Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
 * <p>
 * A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
 * <p>
 * All the visited cells of the path are 0. <br>
 * All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner). <br>
 * The length of a clear path is the number of visited cells of this path. <br>
 */

public class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        var directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        var size = grid.length;
        var visited = new boolean[size][size];
        var queue = new ArrayDeque<int[]>();
        queue.offer(new int[]{0, 0});

        for (var cnt = 1; !queue.isEmpty(); cnt++) {
            for (var i = queue.size(); i > 0; i--) {
                var cell = queue.poll();

                if (cell[0] == size - 1 && cell[1] == size - 1)
                    return cnt;

                for (var dir : directions) {
                    var x = cell[0] + dir[0];
                    var y = cell[1] + dir[1];

                    if (x >= 0 && x < size && y >= 0 && y < size && !visited[x][y] && grid[x][y] == 0) {
                        visited[x][y] = true;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
        return -1;
    }
}
