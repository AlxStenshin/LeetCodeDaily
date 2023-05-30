package day_305;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/minimum-cost-to-cut-a-stick/" >
 * 1547. Minimum Cost to Cut a Stick</a>
 * <p>
 * Given a wooden stick of length n units. The stick is labelled from 0 to n. For example, a stick of length 6 is labelled as follows:
 * <p>
 *
 * Given an integer array cuts where cuts[i] denotes a position you should perform a cut at.
 * <p>
 * You should perform the cuts in order, you can change the order of the cuts as you wish.
 * <p>
 * The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of the stick before the cut). Please refer to the first example for a better explanation.
 * <p>
 * Return the minimum total cost of the cuts.
 */

public class MinimumCostToCutAStick {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int len = cuts.length;
        int[][] dp = new int[len + 2][len + 2];

        for (int l = 2; l <= len + 1; l++) {
            for (int i = 0; i + l <= len + 1; i++) {
                int j = i + l;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
                int left = (i == 0) ? 0 : cuts[i - 1];
                int right = (j == len + 1) ? n : cuts[j - 1];
                dp[i][j] += right - left;
            }
        }

        return dp[0][len + 1];
    }
}
