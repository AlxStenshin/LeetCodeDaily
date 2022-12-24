package day_150;

/**
 * <a href = "https://leetcode.com/problems/domino-and-tromino-tiling/">
 * 790. Domino and Tromino Tiling </a>
 * <p>
 * You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
 * <p>
 * Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.
 * <p>
 * In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.
 */

public class DominoAndTrominoTiling {
    final int MOD = (int) Math.pow(10, 9) + 7;

    public int numTilings(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] % MOD + dp[i - 3] % MOD) % MOD;
        }
        return dp[n];
    }
}
