package day_080;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/string-compression-ii/">
 *  1531. String Compression II</a>
 * <p>
 * Run-length encoding is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3". Thus the compressed string becomes "a2bc3".
 * <p>
 * Notice that in this problem, we are not adding '1' after single characters.
 * <p>
 * Given a string s and an integer k. You need to delete at most k characters from s such that the run-length encoded version of s has minimum length.
 * <p>
 * Find the minimum length of the run-length encoded version of s after deleting at most k characters.
 */

public class StringCompressionTwo {
    public int getLengthOfOptimalCompression(String s, int k) {
        // dp[i][k]: the minimum length for s[:i] with at most k deletion.
        int n = s.length();
        int[][] dp = new int[n + 1][k + 1];
        for (int[] i : dp) Arrays.fill(i, n);
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int m = 0; m <= k; m++) {
                if (m > 0) // delete s[i]
                    dp[i][m] = Math.min(dp[i][m], dp[i - 1][m - 1]);

                // keep s[i], concat the same, remove the different
                int same = 0, diff = 0;
                for (int j = i; j >= 1; j--) {
                    if (s.charAt(j - 1) == s.charAt(i - 1)) same++;
                    else diff++;
                    if (diff > m) break;
                    // baaaaaaccaaaa  k=2, s[i] = a, j will extend to index 1
                    dp[i][m] = Math.min(dp[i][m], dp[j - 1][m - diff] + getRunLength(same));
                }
            }
        }
        return dp[n][k];
    }

    private int getRunLength(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 10) {
            return 2;
        } else if (n < 100) {
            return 3;
        }
        else return 4;
    }
}
