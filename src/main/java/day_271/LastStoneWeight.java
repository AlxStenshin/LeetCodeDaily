package day_271;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/last-stone-weight/" >
 * 1046. Last Stone Weight </a>
 * <p>
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * <p>
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 * <p>
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 * <p>
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 */

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> sortedStones = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(stones).forEach(sortedStones::offer);

        while (sortedStones.size() != 1) {
            int stone1 = sortedStones.poll();
            int stone2 = sortedStones.poll();
            sortedStones.offer(Math.abs(stone1 - stone2));
        }

        return sortedStones.poll();
    }
}
