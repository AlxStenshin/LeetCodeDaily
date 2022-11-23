package day_119;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/valid-sudoku/">
 * 36. Valid Sudoku </a>
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.<br>
 * Each column must contain the digits 1-9 without repetition.<br>
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.<br><p>
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.<br>
 * Only the filled cells need to be validated according to the mentioned rules.
 */

public class ValidSudoku {
    public boolean isValidSudokuStrings(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + "row" + i) ||
                            !seen.add(number + "column" + j) ||
                            !seen.add(number + "subBox" + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }
}
