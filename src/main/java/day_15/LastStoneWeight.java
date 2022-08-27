package day_15;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1046. Last Stone Weight
 * https://leetcode.com/problems/last-stone-weight/
 *
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 *
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
 * Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 *
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 *
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 */

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stoneWeight : stones)
            queue.add(stoneWeight);

        while (queue.size() != 1)
            queue.add(queue.poll() - queue.poll());

        return queue.poll();
    }
}
