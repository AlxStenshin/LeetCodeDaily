package day_262;

import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/" >
 * 2218. Maximum Value of K Coins From Piles </a>
 * <p>
 * There are n piles of coins on a table. Each pile consists of a positive number of coins of assorted denominations.
 * <p>
 * In one move, you can choose any coin on top of any pile, remove it, and add it to your wallet.
 * <p>
 * Given a list piles, where piles[i] is a list of integers denoting the composition of the ith pile from top to bottom, and a positive integer k, return the maximum total value of coins you can have in your wallet if you choose exactly k coins optimally.
 */

public class MaximumValueOfKCoinsFromPiles {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            for (int coins = 0; coins <= k; coins++) {
                int currentSum = 0;
                for (int currentCoins = 0; currentCoins <= Math.min(piles.get(i - 1).size(), coins); currentCoins++) {
                    if (currentCoins > 0) {
                        currentSum += piles.get(i - 1).get(currentCoins - 1);
                    }
                    dp[i][coins] = Math.max(dp[i][coins], dp[i - 1][coins - currentCoins] + currentSum);
                }
            }
        }
        return dp[n][k];
    }
}
