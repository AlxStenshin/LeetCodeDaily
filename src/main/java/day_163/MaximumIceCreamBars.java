package day_163;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/maximum-ice-cream-bars/">
 * 1833. Maximum Ice Cream Bars </a>
 * <p>
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
 * <p>
 * At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.
 * <p>
 * Return the maximum number of ice cream bars the boy can buy with coins coins.
 * <p>
 * Note: The boy can buy the ice cream bars in any order.
 */

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bricksCount = 0;
        for (int cost : costs) {
            if (coins >= cost) {
                bricksCount++;
                coins -= cost;
            }
        }
        return bricksCount;
    }
}
