package day_023;

import java.util.PriorityQueue;

/**
 * 659. Split Array into Consecutive Subsequences
 * https://leetcode.com/problems/split-array-into-consecutive-subsequences/
 *
 * You are given an integer array nums that is sorted in non-decreasing order.
 *
 * Determine if it is possible to split nums into one or more subsequences such that
 * both of the following conditions are true:
 *
 * Each subsequence is a consecutive increasing sequence
 * (i.e. each integer is exactly one more than the previous integer).
 *
 * All subsequences have a length of 3 or more.
 * Return true if you can split nums according to the above conditions, or false otherwise.
 *
 * A subsequence of an array is a new array that is formed from the original array by deleting some (can be none)
 * of the elements without disturbing the relative positions of the remaining elements.
 * (i.e., [1,3,5] is a subsequence of [1,2,3,4,5] while [1,3,2] is not).
 */

public class SplitArrayIntoConsecutiveSubsequences {

    public boolean isPossible(int[] nums) {
        PriorityQueue<Interval> queue = new PriorityQueue<>((a, b) -> (a.end == b.end ? a.len - b.len : a.end - b.end));

        for (int num : nums) {
            while (!queue.isEmpty() && queue.peek().end + 1 < num) {
                if (queue.poll().len < 3) return false;
            }

            if (queue.isEmpty() || queue.peek().end == num)
                queue.offer(new Interval(num, num));
            else { //num == end + 1
                queue.add(new Interval(queue.poll().start, num));
            }
        }

        while (!queue.isEmpty()) {
            if (queue.poll().len < 3)
                return false;
        }

        return true;
    }
}

class Interval {
    int start, end, len;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
        this.len = end - start + 1;
    }
}