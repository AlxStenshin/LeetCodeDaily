package day_272;

import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/smallest-number-in-infinite-set/" >
 * 2336. Smallest Number in Infinite Set </a>
 * <p>
 * You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].
 * <p>
 * Implement the SmallestInfiniteSet class:
 * <p>
 * SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.<br>
 * int popSmallest() Removes and returns the smallest integer contained in the infinite set.<br>
 * void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.<br>
 */

public class SmallestInfiniteSet {

    private Integer minNum;
    private final PriorityQueue<Integer> infiniteSet;

    public SmallestInfiniteSet() {
        minNum = 1;
        infiniteSet = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (!infiniteSet.isEmpty())
            return infiniteSet.poll();
        minNum++;
        return minNum - 1;
    }

    public void addBack(int num) {
        if (minNum > num && !infiniteSet.contains(num))
            infiniteSet.offer(num);
    }

}