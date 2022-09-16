package day_051;

/**
 * <a href="https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/">
 *     1770. Maximum Score from Performing Multiplication Operations</a>
 * <p>
 * You are given two integer arrays nums and multipliers of size n and m respectively, where n >= m. The arrays are 1-indexed.
 * <p>
 * You begin with a score of 0. You want to perform exactly m operations. On the ith operation (1-indexed), you will:
 * <p>
 * Choose one integer x from either the start or the end of the array nums.
 * Add multipliers[i] * x to your score.
 * Remove x from the array nums.
 * Return the maximum score after performing m operations.
 *
 */

public class MaximumScoreFromPerformingMultiplicationOperations {

    public int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] DP = new Integer[multipliers.length + 1][multipliers.length + 1];
        return getMaxScore(nums, 0, nums.length - 1, multipliers, 0, DP);
    }

    int getMaxScore(int[] n, int left, int right, int[] m, int i, Integer[][] DP) {
        if (i == m.length) return 0;
        if (DP[left][n.length - right] == null) {
            int path1 = (n[left] * m[i]) + getMaxScore(n, left + 1, right, m, i + 1, DP);
            int path2 = (n[right] * m[i]) + getMaxScore(n, left, right - 1, m, i + 1, DP);
            DP[left][n.length - right] = Math.max(path1, path2);
        }
        return DP[left][n.length - right];
    }
}
