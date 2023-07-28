package day_365;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/predict-the-winner/" >
 * 486. Predict the Winner </a>
 * <p>
 * You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2.
 * <p>
 * Player 1 and player 2 take turns, with player 1 starting first. Both players start the game with a score of 0. At each turn, the player takes one of the numbers from either end of the array (i.e., nums[0] or nums[nums.length - 1]) which reduces the size of the array by 1. The player adds the chosen number to their score. The game ends when there are no more elements in the array.
 * <p>
 * Return true if Player 1 can win the game. If the scores of both players are equal, then player 1 is still the winner, and you should also return true. You may assume that both players are playing optimally.
 */

public class PredictTheWinner {
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        if (len % 2 == 0)
            return true;
        int[][] dp = new int[len][len];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }
        return util(0, len - 1, nums, dp) >= 0;
    }

    public int util(int left, int right, int[] nums, int[][] dp) {
        if (left == right) {
            return nums[left];
        }
        if (dp[left][right] != -1) {
            return dp[left][right];
        }
        int x = nums[left] - util(left + 1, right, nums, dp);
        int y = nums[right] - util(left, right - 1, nums, dp);
        return dp[left][right] = Math.max(x, y);
    }
}
