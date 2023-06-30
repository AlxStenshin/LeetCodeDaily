package day_338;

/**
 * <a href = "https://leetcode.com/problems/last-day-where-you-can-still-cross/" >
 * 1970. Last Day Where You Can Still Cross </a>
 * <p>
 * There is a 1-based binary matrix where 0 represents land and 1 represents water. You are given integers row and col representing the number of rows and columns in the matrix, respectively.
 * <p>
 * Initially on day 0, the entire matrix is land. However, each day a new cell becomes flooded with water. You are given a 1-based 2D array cells, where cells[i] = [ri, ci] represents that on the ith day, the cell on the rith row and cith column (1-based coordinates) will be covered with water (i.e., changed to 1).
 * <p>
 * You want to find the last day that it is possible to walk from the top to the bottom by only walking on land cells. You can start from any cell in the top row and end at any cell in the bottom row. You can only travel in the four cardinal directions (left, right, up, and down).
 * <p>
 * Return the last day where it is possible to walk from the top to the bottom by only walking on land cells.
 */

public class LastDayWhereYouCanStillCross {
    int row = 0;
    int col = 0;
    int[][] cells;
    public int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int latestDayToCross(int row, int col, int[][] cells) {
        this.cells = cells;
        this.row = row;
        this.col = col;

        int left = 1, right = cells.length;
        int mid;
        while (left < right) {
            mid = right - (right - left) / 2;
            if (canCross(mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public boolean canCross(int day) {
        int[][] grid = new int[row][col];
        for (int i = 0; i < day; i++) {
            grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
        }

        for (int i = 0; i < col; i++) {
            if (grid[0][i] == 0 && dfs(grid, 0, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= row || c < 0 || c >= col || grid[r][c] != 0) return false;

        if (r == row - 1) return true;
        grid[r][c] = -1;
        for (int[] direction : directions) {
            int i = r + direction[0];
            int j = c + direction[1];
            if (dfs(grid, i, j)) return true;
        }
        return false;
    }
}
