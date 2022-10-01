package day_066;

/**
 * <a href=https://leetcode.com/problems/decode-ways/">
 *    91. Decode Ways</a>
 * <p>
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * <p>
 * 'A' -> "1"<p>
 * 'B' -> "2"<p>
 * ...<p>
 * 'Z' -> "26"<p>
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:<p>
 * "AAJF" with the grouping (1 1 10 6) <p>
 * "KJF" with the grouping (11 10 6)<p>
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".<p>
 * Given a string s containing only digits, return the number of ways to decode it.<p>
 * The test cases are generated so that the answer fits in a 32-bit integer.
*/

public class DecodeWays {
    public int numDecodings(String s) {
        int size = s.length();

        if (size == 0)
            return 0;

        int[] dp = new int[size+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= size; i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[size];
    }
}
