package day_149;

/**
 * <a href = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/">
 *  309. Best Time to Buy and Sell Stock with Cooldown </a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */

public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int n = prices.length;
        int[] sells = new int[n];
        int[] coolDowns = new int[n];

        sells[0] = 0;
        sells[1] = Math.max(prices[1] - prices[0], 0);

        for (int i = 2; i < sells.length; i++) {
            int profit = prices[i] - prices[i - 1];
            sells[i] = Math.max(Math.max(sells[i - 1], coolDowns[i - 2]) + profit, 0);
            coolDowns[i] = Math.max(sells[i - 1], coolDowns[i - 1]);
        }

        return Math.max(sells[n - 1], coolDowns[n - 1]);
    }
}
