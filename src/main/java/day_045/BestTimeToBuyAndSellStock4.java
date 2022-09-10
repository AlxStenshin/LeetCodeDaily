package day_045;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/">
 *     188. Best Time to Buy and Sell Stock IV</a>
 * <p>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
 * Find the maximum profit you can achieve. You may complete at most k transactions.
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */

public class BestTimeToBuyAndSellStock4 {
    public int maxProfit(int k, int[] prices) {
        int[] lowestCost = new int[k + 1];
        int[] profit = new int[k + 1];

        Arrays.fill(lowestCost, Integer.MAX_VALUE);
        for (int price : prices) {
            for (int i = 1; i < k + 1; i++) {
                lowestCost[i] = Math.min(lowestCost[i], price - profit[i - 1]);
                profit[i] = Math.max(profit[i], price - lowestCost[i]);
            }
        }
        return profit[k];
    }
}
