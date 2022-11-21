package day_117;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/">
 * 1926. Nearest Exit from Entrance in Maze </a>
 * <p>
 * You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
 * <p>
 * In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
 * <p>
 * Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
 */

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int mazeRows = maze.length;
        int mazeCols = maze[0].length;
        int entryRow = entrance[0];
        int entryCol = entrance[1];

        maze[entryRow][entryCol] = '+';

        Queue<ExitPoint> queue = new LinkedList<>();
        queue.offer(new ExitPoint(entryRow, entryCol, 0));

        while(!queue.isEmpty()) {
            ExitPoint currentPoint = queue.poll();
            for (var nextPoint : currentPoint.getNeighbours()) {
                if (nextPoint.x >= 0 && nextPoint.x < mazeRows &&
                        nextPoint.y >= 0 && nextPoint.y < mazeCols &&
                        maze[nextPoint.x][nextPoint.y] == '.') {
                    if (nextPoint.x == 0 || nextPoint.x == mazeRows - 1 ||
                            nextPoint.y == 0 || nextPoint.y == mazeCols -1) {
                        return currentPoint.dist + 1;
                    }
                    maze[nextPoint.x][nextPoint.y] = '+';
                    nextPoint.dist = currentPoint.dist + 1;
                    queue.offer(nextPoint);
                }
            }
        }
        return -1;
    }

    private static class ExitPoint {
        int x;
        int y;
        int dist;

        public ExitPoint(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        public List<ExitPoint> getNeighbours() {
            List<ExitPoint> neighbours = new ArrayList<>();
            int[][] movingDirections = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (var dir : movingDirections) {
                neighbours.add(new ExitPoint(this.x + dir[0], this.y + dir[1], this.dist));
            }
            return neighbours;
        }
    }
}
