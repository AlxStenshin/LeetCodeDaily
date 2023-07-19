package day_357;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href = "https://leetcode.com/problems/non-overlapping-intervals/" >
 * 435. Non-overlapping Intervals </a>
 * <p>
 * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 */

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int prev = 0;
        int count = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count++;
            }
        }

        return intervals.length - count;
    }
}
