package day_214;

/**
 * <a href = "https://leetcode.com/problems/edit-distance/">
 * 72. Edit Distance </a>
 * <p>
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * <p>
 * You have the following three operations permitted on a word:
 * <p>
 * Insert a character<br>
 * Delete a character<br>
 * Replace a character
 **/

public class EditDistance {


    public int minDistanceRecursion(String word1, String word2) {
        return minDist(word1, word2, word1.length(), word2.length());
    }

    int minDist(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }

        if (word2Index == 0) {
            return word1Index;
        }

        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            return minDist(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int insertOperation = minDist(word1, word2, word1Index, word2Index - 1);
            int deleteOperation = minDist(word1, word2, word1Index - 1, word2Index);
            int replaceOperation = minDist(word1, word2, word1Index - 1, word2Index - 1);
            return Math.min(insertOperation, Math.min(deleteOperation, replaceOperation)) + 1;
        }
    }


    Integer[][] memo;

    public int minDistance_DP_TopDown(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return minDistanceRecur(word1, word2, word1.length(), word2.length());
    }

    int minDistanceRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }

        if (word2Index == 0) {
            return word1Index;
        }

        if (memo[word1Index][word2Index] != null) {
            return memo[word1Index][word2Index];
        }

        int minEditDistance;
        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            minEditDistance = minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int insertOperation = minDistanceRecur(word1, word2, word1Index, word2Index - 1);
            int deleteOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index);
            int replaceOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
            minEditDistance = Math.min(insertOperation, Math.min(deleteOperation, replaceOperation)) + 1;
        }
        memo[word1Index][word2Index] = minEditDistance;
        return minEditDistance;
    }


    public int minDistance_DP_Tabulation(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length == 0) {
            return word2Length;
        }

        if (word2Length == 0) {
            return word1Length;
        }

        int[][] dp = new int[word1Length + 1][word2Length + 1];

        for (int word1Index = 1; word1Index <= word1Length; word1Index++) {
            dp[word1Index][0] = word1Index;
        }

        for (int word2Index = 1; word2Index <= word2Length; word2Index++) {
            dp[0][word2Index] = word2Index;
        }

        for (int word1Index = 1; word1Index <= word1Length; word1Index++) {
            for (int word2Index = 1; word2Index <= word2Length; word2Index++) {
                if (word2.charAt(word2Index - 1) == word1.charAt(word1Index - 1)) {
                    dp[word1Index][word2Index] = dp[word1Index - 1][word2Index - 1];
                } else {
                    dp[word1Index][word2Index] = Math.min(dp[word1Index - 1][word2Index],
                            Math.min(dp[word1Index][word2Index - 1], dp[word1Index - 1][word2Index - 1])) + 1;
                }
            }
        }

        return dp[word1Length][word2Length];
    }

}
