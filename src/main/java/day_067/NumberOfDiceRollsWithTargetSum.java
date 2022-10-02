package day_067;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href=https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/">
 *    1155. Number of Dice Rolls With Target Sum</a>
 * <p>
 * You have n dice and each die has k faces numbered from 1 to k.
 * <p>
 * Given three integers n, k, and target, return the number of possible ways (out of the k^n total ways) to roll the dice so the sum of the face-up numbers equals target.
 * <p>
 * Since the answer may be too large, return it modulo 10^9 + 7.
 */

public class NumberOfDiceRollsWithTargetSum {
    Map<String, Integer> memo = new HashMap<>();
    int MOD = 100_000_000_7;

    public int numRollsToTarget(int n, int k, int target) {
        if (target > n * k || target < n)
            return 0;

        if (n == 1)
            return (target <= k) ? 1 : 0;

        String key = "" + n + k + target;

        if (!memo.containsKey(key)) {
            int currentSum = 0;

            for (int i = k; i > 0; i--) {
                currentSum += numRollsToTarget(n - 1, k, target - i);
                currentSum %= MOD;
            }
            memo.put(key, currentSum);
        }
        return memo.get(key);
    }
}
