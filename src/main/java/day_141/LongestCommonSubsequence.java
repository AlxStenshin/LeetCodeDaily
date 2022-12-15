package day_141;

/**
 * <a href="https://leetcode.com/problems/longest-common-subsequence/">
 *  931. Minimum Falling Path Sum </a>
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".<br>
 * A common subsequence of two strings is a subsequence that is common to both strings.
 */

public class LongestCommonSubsequence {
    int longestCommonSubsequence(String text1, String text2) {
        char[] first = text1.toCharArray();
        char[] second = text2.toCharArray();

        int firstLen = first.length;
        int secondLen = second.length;

        int[][] storage = new int[firstLen + 1][secondLen + 1];

        for (int i = 1; i < firstLen + 1; i++) {
            for (int j = 1; j < secondLen + 1; j++) {
                if (first[i - 1] == second[j - 1]) {
                    storage[i][j] = storage[i - 1][j - 1] + 1;
                } else {
                    storage[i][j] = Math.max(storage[i - 1][j], storage[i][j - 1]);
                }
            }
        }
        return storage[firstLen][secondLen];
    }
}
