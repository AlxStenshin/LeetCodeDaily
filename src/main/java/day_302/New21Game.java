package day_302;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/new-21-game/description/" >
 * 837. New 21 Game </a>
 * <p>
 * Alice plays the following game, loosely based on the card game "21".
 * <p>
 * Alice starts with 0 points and draws numbers while she has less than k points. During each draw, she gains an integer number of points randomly from the range [1, maxPts], where maxPts is an integer. Each draw is independent and the outcomes have equal probabilities.
 * <p>
 * Alice stops drawing numbers when she gets k or more points.
 * <p>
 * Return the probability that Alice has n or fewer points.
 * <p>
 * Answers within 10-5 of the actual answer are considered accepted.
 */

public class New21Game {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0) return 1.0;
        if (n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        Arrays.fill(dp, 0.0);

        double probability = 0.0;
        double windowSum = 1.0;
        dp[0] = 1.0;
        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) windowSum += dp[i];
            else probability += dp[i];

            if (i >= maxPts) windowSum -= dp[i - maxPts];
        }

        return probability;
    }
}