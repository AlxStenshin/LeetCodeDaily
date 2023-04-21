package day_268;

/**
 * <a href = "https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/" >
 * 879. Profitable Schemes </a>
 * <p>
 * There is a group of n members, and a list of various crimes they could commit. The ith crime generates a profit[i] and requires group[i] members to participate in it. If a member participates in one crime, that member can't participate in another crime.
 * <p>
 * Let's call a profitable scheme any subset of these crimes that generates at least minProfit profit, and the total number of members participating in that subset of crimes is at most n.
 * <p>
 * Return the number of schemes that can be chosen. Since the answer may be very large, return it modulo 109 + 7.
 */

public class ProfitableSchemes {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = (int) 1e9 + 7;
        int[][] dp = new int[minProfit + 1][n + 1];
        dp[0][0] = 1;

        for (int k = 0; k < group.length; k++) {
            int g = group[k];
            int p = profit[k];
            for (int i = minProfit; i >= 0; i--) {
                for (int j = n - g; j >= 0; j--) {
                    int newProfit = Math.min(i + p, minProfit);
                    dp[newProfit][j + g] += dp[i][j];
                    dp[newProfit][j + g] %= MOD;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += dp[minProfit][i];
            sum %= MOD;
        }
        return sum;
    }
}
