package day_120;

/**
 * <a href = "https://leetcode.com/problems/word-search/">
 * 79. Word Search </a>
 * <p>
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */

public class WordSearch {
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(board, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, boolean[][] visited, String word, int x, int y, int idx) {
        if (idx == word.length())
            return true;

        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y] || board[x][y] != word.charAt(idx)) {
            return false;
        }

        visited[x][y] = true;
        boolean result = false;

        for (var dir : directions) {
            if (helper(board, visited, word, x + dir[0], y + dir[1], idx + 1)) {
                result = true;
                break;
            }
        }

        visited[x][y] = false;
        return result;
    }
}
