package day_269;

/**
 * <a href = "https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/" >
 * 1312. Minimum Insertion Steps to Make a String Palindrome </a>
 * <p>
 * Given a string s. In one step you can insert any character at any index of the string.
 * <p>
 * Return the minimum number of steps to make s palindrome.
 * <p>
 * A Palindrome String is one that reads the same backward as well as forward.
 */

public class MinimumInsertionStepsToMakeAStringPalindrome {

    public int minInsertions(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                int val;
                if (s.charAt(i - 1) == reversed.charAt(j - 1)) {
                    val = 1 + dp[i - 1][j - 1];
                } else {
                    val = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dp[i][j] = val;
            }
        }

        int lcsCount = dp[len][len];
        return len - lcsCount;
    }
}
