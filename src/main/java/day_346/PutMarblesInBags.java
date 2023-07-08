package day_346;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/put-marbles-in-bags/" >
 * 2551. Put Marbles in Bags </a>
 * <p>
 *
 * You have k bags. You are given a 0-indexed integer array weights where weights[i] is the weight of the ith marble. You are also given the integer k.
 * <p>
 * Divide the marbles into the k bags according to the following rules:
 * <p>
 * No bag is empty. <br>
 * If the ith marble and jth marble are in a bag, then all marbles with an index between the ith and jth indices should also be in that same bag.<br>
 * If a bag consists of all the marbles with an index from i to j inclusively, then the cost of the bag is weights[i] + weights[j].<br>
 * The score after distributing the marbles is the sum of the costs of all the k bags.
 * <p>
 * Return the difference between the maximum and minimum scores among marble distributions.
 */

public class PutMarblesInBags {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] pairs = new int[n - 1];
        for (int i = 1; i < n; i++) {
            pairs[i - 1] = weights[i] + weights[i - 1];
        }
        Arrays.sort(pairs);
        long minScore = 0;
        long maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairs[i];
            maxScore += pairs[n - i - 2];
        }
        return maxScore - minScore;
    }
}
