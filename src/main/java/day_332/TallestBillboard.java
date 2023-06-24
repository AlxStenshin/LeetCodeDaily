package day_332;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/tallest-billboard/" >
 * 956. Tallest Billboard </a>
 * <p>
 * You are installing a billboard and want it to have the largest height. The billboard will have two steel supports, one on each side. Each steel support must be an equal height.
 * <p>
 * You are given a collection of rods that can be welded together. For example, if you have rods of lengths 1, 2, and 3, you can weld them together to make a support of length 6.
 * <p>
 * Return the largest possible height of your billboard installation. If you cannot support the billboard, return 0.
 */

public class TallestBillboard {
    public int tallestBillboard(int[] rods) {
        int sum = Arrays.stream(rods).sum();

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int rod : rods) {
            int[] dpCopy = dp.clone();

            for (int i = 0; i <= sum - rod; i++) {
                if (dpCopy[i] < 0) continue;

                dp[i + rod] = Math.max(dp[i + rod], dpCopy[i]);
                dp[Math.abs(i - rod)] = Math.max(dp[Math.abs(i - rod)], dpCopy[i] + Math.min(i, rod));
            }
        }
        return dp[0];
    }
}
