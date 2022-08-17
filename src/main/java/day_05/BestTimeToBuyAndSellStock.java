package day_05;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 */

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;
    }

    public int maxProfit2D(int[] prices) {
        int len = prices.length;
        int[][] profit = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++)
                profit[i][j] = prices[j] - prices[i];
        }
        return Arrays.stream(profit).flatMapToInt(IntStream::of).max().orElse(0);
    }
}
