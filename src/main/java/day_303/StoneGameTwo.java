package day_303;

/**
 * <a href = "https://leetcode.com/problems/stone-game-ii/" >
 * 1140. Stone Game II </a>
 * <p>
 * Alice and Bob continue their games with piles of stones.  There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].  The objective of the game is to end with the most stones.
 * <p>
 * Alice and Bob take turns, with Alice starting first.  Initially, M = 1.
 * <p>
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.  Then, we set M = max(M, X).
 * <p>
 * The game continues until all the stones have been taken.
 * <p>
 * Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.
 */

public class StoneGameTwo {
    public int stoneGameII(int[] piles) {
        if (piles.length == 0)
            return 0;

        int[][] dp = new int[piles.length][piles.length];
        int[] suffixSum = new int[piles.length];
        suffixSum[suffixSum.length - 1] = piles[piles.length - 1];
        for (int i = piles.length - 2; i >= 0; --i) suffixSum[i] = piles[i] + suffixSum[i + 1];

        return helper(piles, dp, suffixSum, 0, 1);
    }

    private int helper(int[] piles, int[][] dp, int[] suffixSum, int i, int M) {
        if (i == piles.length) return 0;
        if (i + 2 * M >= piles.length) return suffixSum[i];

        if (dp[i][M] != 0) return dp[i][M];

        int result = 0;
        for (int x = 1; x <= 2 * M; ++x) {
            result = Math.max(result, suffixSum[i] - helper(piles, dp, suffixSum, i + x, Math.max(M, x)));
        }

        dp[i][M] = result;
        return result;
    }
}
