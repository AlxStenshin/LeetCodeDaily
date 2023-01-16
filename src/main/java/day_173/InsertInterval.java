package day_173;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/insert-interval/">
 * 57. Insert Interval </a>
 * <p>
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * <p>
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * <p>
 * Return intervals after the insertion.
 */

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        final int start = 0;
        final int end = 1;
        List<int[]> result = new ArrayList<>();

        for (int[] curInterval : intervals) {
            if (curInterval[end] < newInterval[start]) {
                result.add(curInterval);
            } else if (curInterval[start] > newInterval[end]) {
                result.add(newInterval);
                newInterval = curInterval;
            } else {
                newInterval[start] = Math.min(newInterval[start], curInterval[start]);
                newInterval[end] = Math.max(newInterval[end], curInterval[end]);
            }
        }
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}

