package day_290;

/**
 * <a href = "https://leetcode.com/problems/count-ways-to-build-good-strings/" >
 * 2466. Count Ways To Build Good Strings </a>
 * <p>
 * Given the integers zero, one, low, and high, we can construct a string by starting with an empty string, and then at each step perform either of the following:
 * <p>
 * Append the character '0' zero times.
 * Append the character '1' one times.
 * This can be performed any number of times.
 * <p>
 * A good string is a string constructed by the above process having a length between low and high (inclusive).
 * <p>
 * Return the number of different good strings that can be constructed satisfying these properties. Since the answer can be large, return it modulo 109 + 7.
 */

public class CountWaysToBuildGoodStrings {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int ans = 0;
        for (int i = 1; i <= high; i++) {
            dp[i] = ((i - zero >= 0 ? dp[i - zero] : 0) + (i - one >= 0 ? dp[i - one] : 0)) % 1000000007;
            if (i >= low) {
                ans = (ans + dp[i]) % 1000000007;
            }
        }
        return ans;
    }
}