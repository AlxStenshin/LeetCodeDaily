package day_181;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/snakes-and-ladders/">
 * 909. Snakes and Ladders </a>
 * <p>
 * You are given an n x n integer matrix board where the cells are labeled from 1 to n2 in a Boustrophedon style starting from the bottom left of the board (i.e. board[n - 1][0]) and alternating direction each row.
 * <p>
 * You start on square 1 of the board. In each move, starting from square curr, do the following:
 * <p>
 * Choose a destination square next with a label in the range [curr + 1, min(curr + 6, n2)].<br>
 * This choice simulates the result of a standard 6-sided die roll: i.e., there are always at most 6 destinations, regardless of the size of the board.<br>
 * If next has a snake or ladder, you must move to the destination of that snake or ladder. Otherwise, you move to next.<br>
 * The game ends when you reach the square n2.<br>
 * A board square on row r and column c has a snake or ladder if board[r][c] != -1. The destination of that snake or ladder is board[r][c]. Squares 1 and n2 do not have a snake or ladder.<br>
 * <p>
 * Note that you only take a snake or ladder at most once per move. If the destination to a snake or ladder is the start of another snake or ladder, you do not follow the subsequent snake or ladder.
 * <p>
 * For example, suppose the board is [[-1,4],[-1,3]], and on the first move, your destination square is 2. You follow the ladder to square 3, but do not follow the subsequent ladder to 4.
 * Return the least number of moves required to reach the square n2. If it is not possible to reach the square, return -1.
 */

public class SnakesAndLadders {

    int length = 0;
    public int snakesAndLadders(int[][] board) {
        length = board.length;
        HashMap<Integer, Integer> visited = new HashMap<>();
        visited.put(1, 0);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);

        while (!arr.isEmpty()) {
            int n = arr.get(0);
            arr.remove(0);
            for (int i = n + 1; i <= n + 6; i++) {
                int next = i;
                int[] nextPos = getPosition(i);
                if (next > length * length)
                    return -1;

                if (board[nextPos[0]][nextPos[1]] != -1) {
                    next = board[nextPos[0]][nextPos[1]];
                }

                if (next == length * length)
                    return visited.get(n) + 1;

                if (!visited.containsKey(next)) {
                    visited.put(next, visited.get(n) + 1);
                    arr.add(next);
                }
            }
        }
        return -1;
    }

    public int[] getPosition(int n) {
        int row = (n - 1) / length;
        int column = (n - 1) % length;
        if (row % 2 != 0) {
            column = (column - length + 1) * -1;
        }
        row = (row - length + 1) * -1;

        return new int[]{row, column};
    }
}
