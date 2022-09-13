package day_047;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/bag-of-tokens/">948. Bag of Tokens</a>
 * <p>
 * You have an initial power of power, an initial score of 0, and a bag of tokens where tokens[i] is the value of the ith token (0-indexed).
 * Your goal is to maximize your total score by potentially playing each token in one of two ways:
 * <p>
 * If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power and gaining 1 score.
 * If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and losing 1 score.
 * Each token may be played at most once and in any order. You do not have to play all the tokens.
 * <p>
 * Return the largest possible score you can achieve after playing any number of tokens.
 */
public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int len = tokens.length;

        for (int i = 0; i < len; i++) {
            if (tokens[i] <= power) {
                power -= tokens[i];
                score++;
            } else if ((tokens[i] >= power && score >= 1) && (i != len - 1)) {
                power += tokens[len - 1];
                score--;
                i--;
                len--;
            } else
                break;
        }
        return score;
    }
}