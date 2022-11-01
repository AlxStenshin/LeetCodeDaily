package day_097;

/**
 * <a href = "https://leetcode.com/problems/where-will-the-ball-fall/">
 * 1706. Where Will the Ball Fall </a>
 * <p>
 * You have a 2-D grid of size m x n representing a box, and you have n balls. The box is open on the top and bottom sides.
 * <p>
 * Each cell in the box has a diagonal board spanning two corners of the cell that can redirect a ball to the right or to the left.
 * <p>
 * A board that redirects the ball to the right spans the top-left corner to the bottom-right corner and is represented in the grid as 1.
 * A board that redirects the ball to the left spans the top-right corner to the bottom-left corner and is represented in the grid as -1.
 * We drop one ball at the top of each column of the box. Each ball can get stuck in the box or fall out of the bottom. A ball gets stuck if it hits a "V" shaped pattern between two boards or if a board redirects the ball into either wall of the box.
 * <p>
 * Return an array answer of size n where answer[i] is the column that the ball falls out of at the bottom after dropping the ball from the ith column at the top, or -1 if the ball gets stuck in the box.
 */

public class WhereWillTheBallFall {
    public int[] findBall(int[][] grid) {
        int rows = grid[0].length;

        int[] result = new int[rows];
        for (int i = 0; i < rows; i++) {
            result[i] = findBallDropColumn(0, i, grid);
        }
        return result;
    }

    public int findBallDropColumn(int row, int col, int[][] grid) {
        int rows = grid[0].length;

        if (row == grid.length)
            return col;

        // grid stores only +1 or -1 values, so we can calculate next column as cell value
        int nextColumn = col + grid[row][col];


        if (    // left wall
                nextColumn < 0 ||
                // right wall
                nextColumn > rows - 1 ||
                // Ball Stuck, the value of the adjacent cell is different from the current cell
                grid[row][col] != grid[row][nextColumn]) {
            return -1;
        }

        return findBallDropColumn(row + 1, nextColumn, grid);
    }
}

