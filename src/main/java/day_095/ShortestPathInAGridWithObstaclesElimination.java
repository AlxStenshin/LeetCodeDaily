package day_095;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/">
 * 1293. Shortest Path in a Grid with Obstacles Elimination </a>
 * <p>
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle). You can move up, down, left, or right from and to an empty cell in one step.
 * <p>
 * Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1) given that you can eliminate at most k obstacles. If it is not possible to find such walk return -1.
 */

public class ShortestPathInAGridWithObstaclesElimination {
    public int shortestPath(int[][] grid, int k) {
        int[][] directions = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][][] visited = new boolean[rows][cols][rows * cols];
        Queue<PathNode> path = new LinkedList<>();
        path.offer(new PathNode(0, 0, 0, 0));
        visited[0][0][0] = true;

        while (!path.isEmpty()) {
            PathNode current = path.poll();
            int i = current.x;
            int j = current.y;
            int dist = current.steps;
            int rem = current.removed;

            if (i == rows - 1 && j == cols - 1)
                return dist;

            for (int d = 0; d < 4; d++) {
                int nextX = i + directions[d][0];
                int nextY = j + directions[d][1];

                if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols) {
                    int newRemoved = rem + grid[nextX][nextY];
                    if (k >= newRemoved && !visited[nextX][nextY][newRemoved]) {
                        visited[nextX][nextY][newRemoved] = true;
                        path.offer(new PathNode(nextX, nextY, dist + 1, newRemoved));
                    }
                }
            }
        }
        return -1;
    }

    private static class PathNode {
        int x;
        int y;
        int steps;
        int removed;

        PathNode(int x, int y, int steps, int removed) {
            this.x = x;
            this.y = y;
            this.steps = steps;
            this.removed = removed;
        }
    }
}
