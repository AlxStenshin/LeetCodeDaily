package day_154;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/remove-stones-to-minimize-the-total/">
 *     1962. Remove Stones to Minimize the Total </a>
 * <p>
 * You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile, and an integer k. You should apply the following operation exactly k times:
 * <p>
 * Choose any piles[i] and remove floor(piles[i] / 2) stones from it.<br>
 * Notice that you can apply the operation on the same pile more than once.
 * <p>
 * Return the minimum possible total number of stones remaining after applying the k operations.
 * <p>
 * floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
 */

public class RemoveStonesToMinimizeTheTotal {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pilesPQ = new PriorityQueue<>(piles.length, ((a, b) -> b - a));

        for (int pile : piles) {
            pilesPQ.offer(pile);
        }

        for (int i = 0; i != k; i++) {
            int pileValue = pilesPQ.poll();
            int modifiedPile = (int) (pileValue - Math.floor((double)pileValue / 2));
            pilesPQ.offer(modifiedPile);
        }

        return pilesPQ.stream().reduce(Integer::sum).orElse(0);
    }
}
