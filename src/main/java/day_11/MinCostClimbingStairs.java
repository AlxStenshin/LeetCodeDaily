package day_11;

/**
 * 746. Min Cost Climbing Stairs
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 *
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 */

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCosts = new int[n + 1];

        for (int i = 2; i - 1 < n; i++)
            minCosts[i] = Math.min(
                    minCosts[i - 1] + cost[i - 1],
                    minCosts[i - 2] + cost[i - 2]);
        return minCosts[n];
    }
}
