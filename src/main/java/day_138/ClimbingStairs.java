package day_138;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">
 *  70. Climbing Stairs </a>
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 3)
            return n;

        int[] climbingWaysCount = new int[n + 1];
        climbingWaysCount[0] = climbingWaysCount[1] = 1;
        for (int i = 2; i <= n; i++)
            climbingWaysCount[i] = climbingWaysCount[i - 1] + climbingWaysCount[i - 2];
        return climbingWaysCount[n];
    }
}
