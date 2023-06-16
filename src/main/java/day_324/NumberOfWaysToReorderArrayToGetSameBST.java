package day_324;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/" >
 * 1569. Number of Ways to Reorder Array to Get Same BST </a>
 * <p>
 * Given an array nums that represents a permutation of integers from 1 to n. We are going to construct a binary search tree (BST) by inserting the elements of nums in order into an initially empty BST. Find the number of different ways to reorder nums so that the constructed BST is identical to that formed from the original array nums.
 * <p>
 * For example, given nums = [2,1,3], we will have 2 as the root, 1 as a left child, and 3 as a right child. The array [2,3,1] also yields the same BST but [3,2,1] yields a different BST.
 * <p>
 * Return the number of ways to reorder nums such that the BST formed is identical to the original BST formed from nums.
 * <p>
 * Since the answer may be very large, return it modulo 109 + 7.
 */

public class NumberOfWaysToReorderArrayToGetSameBST {
    private static final int MOD = 1000000007;

    public int numOfWays(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return countWays(list) - 1;
    }

    private int countWays(List<Integer> nums) {
        if (nums.size() <= 2) {
            return 1;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int root = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < root) {
                left.add(nums.get(i));
            } else {
                right.add(nums.get(i));
            }
        }

        long leftCount = countWays(left);
        long rightCount = countWays(right);

        return (int) ((comb(nums.size() - 1, left.size()) % MOD) * (leftCount % MOD) % MOD * (rightCount % MOD) % MOD);
    }

    private long comb(int n, int k) {
        long[][] dp = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }
        return dp[n][k];
    }
}
