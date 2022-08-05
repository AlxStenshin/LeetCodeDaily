package day_009;

/**
 * 377. Combination Sum IV
 * <a href="https://leetcode.com/problems/combination-sum-iv/">...</a>
 * <p>
 * Given an array of distinct integers nums and a target integer target,
 * return the number of possible combinations that add up to target.
 * <p>
 * The test cases are generated so that the answer can fit in a 32-bit integer.
 *
 */

public class CombinationSum4 {
    /*
        Top-Down DP Approach: Our DP array (dp) will contain cells (dp[i]) where i will represent the remaining space left
        before T and dp[i] will represent the number of ways the solution (dp[T]) can be reached from i.

        At each value of i as we build out dp we'll iterate through the different nums in our number array (N) and consider
        the cell that can be reached with each num (dp[i-num]). The value of dp[i] will therefore be the sum of the results
        of each of those possible moves.

        We'll need to seed dp[0] with a value of 1 to represent the value of the completed combination,
        then once the iteration is complete, we can return dp[T] as our final answer.
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++)
            for (int num : nums)
                if (num <= i) dp[i] += dp[i-num];
        return dp[target];
    }
}
