package day_263;

/**
 * <a href = "https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/" >
 * 1639. Number of Ways to Form a Target String Given a Dictionary </a>
 * <p>
 * You are given a list of strings of the same length words and a string target.
 * <p>
 * Your task is to form target using the given words under the following rules:
 * <p>
 * target should be formed from left to right.<br>
 * To form the ith character (0-indexed) of target, you can choose the kth character of the jth string in words if target[i] = words[j][k].<br>
 * Once you use the kth character of the jth string of words, you can no longer use the xth character of any string in words where x <= k. In other words, all characters to the left of or at index k become unusuable for every string.<br>
 * Repeat the process until you form the string target.<br>
 * Notice that you can use multiple characters from the same string in words provided the conditions above are met.<br>
 * <p>
 * Return the number of ways to form target from words. Since the answer may be too large, return it modulo 109 + 7.
 */

public class NumberOfWaysToFormATargetStringGivenADictionary {
    public int numWays(String[] words, String target) {
        int sourceLen = words[0].length();
        int targetLen = target.length();
        int mod = 1000000007;
        int[] dp = new int[targetLen + 1];
        dp[0] = 1;

        int[][] count = new int[sourceLen][26];
        for (String word : words) {
            for (int i = 0; i < sourceLen; i++) {
                count[i][word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < sourceLen; i++) {
            for (int j = targetLen - 1; j >= 0; j--) {
                dp[j + 1] += (int) ((long) dp[j] * count[i][target.charAt(j) - 'a'] % mod);
                dp[j + 1] %= mod;
            }
        }

        return dp[targetLen];
    }
}
