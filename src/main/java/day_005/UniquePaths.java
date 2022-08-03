package day_005;

/**
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 *
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot
 * can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */

public class UniquePaths {

    public int uniquePaths(int columns, int rows) {
        int[][] matrix = new int[rows][columns];

        // Total Right Moves
        for (int i = 0; i < columns; i++) {
            matrix[0][i] = 1;
        }

        // Total Down Moves
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 1;
        }

        // Counting ways reaching cell [0,0] (back, left) from every cell
        // | 1 | 1 | 1 |
        // | 1 | 2 | 3 |
        // | 1 | 3 | 6 |
        // | 1 | 4 | 10| <- result
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        return matrix[rows - 1][columns - 1];
    }
}
