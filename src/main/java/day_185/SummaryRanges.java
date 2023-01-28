package day_185;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * <a href = "https://leetcode.com/problems/data-stream-as-disjoint-intervals/">
 * 352. Data Stream as Disjoint Intervals </a>
 * <p>
 * Given a data stream input of non-negative integers a1, a2, ..., an, summarize the numbers seen so far as a list of disjoint intervals.
 * <p>
 * Implement the SummaryRanges class:
 * <p>
 * SummaryRanges() Initializes the object with an empty stream.<br>
 * void addNum(int value) Adds the integer value to the stream.
 * <p>
 * int[][] getIntervals() Returns a summary of the integers in the stream currently as a list of disjoint intervals [starti, endi]. The answer should be sorted by starti.<br>
 */
public class SummaryRanges {
    private final TreeMap<Integer, int[]> map = new TreeMap<>();

    public void addNum(int val) {
        if (map.containsKey(val))
            return;

        final Integer min = map.lowerKey(val);
        final Integer max = map.higherKey(val);

        if (min != null && max != null &&
                map.get(min)[1] + 1 == val &&
                val + 1 == max) {
            map.get(min)[1] = map.get(max)[1];
            map.remove(max);
        } else if (min != null && map.get(min)[1] + 1 >= val) {
            map.get(min)[1] = Math.max(map.get(min)[1], val);
        } else if (max != null && val + 1 == max) {
            map.put(val, new int[]{val, map.get(max)[1]});
            map.remove(max);
        } else {
            map.put(val, new int[]{val, val});
        }
    }

    public int[][] getIntervals() {
        ArrayList intervals = new ArrayList<>(map.values());
        return (int[][]) intervals.toArray(new int[intervals.size()][]);
    }

}

