package day_072;


import java.util.TreeMap;

/**
 * <a href=https://leetcode.com/problems/time-based-key-value-store/">
 *   981. Time Based Key-Value Store</a>
 * <p>
 * A k-booking happens when k events have some non-empty intersection (i.e., there is some time that is common to all k events.)
 * <p>
 * You are given some events [start, end), after each given event, return an integer k representing the maximum k-booking between all the previous events.
 * <p>
 * Implement the MyCalendarThree class:
 * <p>
 * MyCalendarThree() Initializes the object.
 * <p>
 * int book(int start, int end) Returns an integer k representing the largest integer such that there exists a k-booking in the calendar.
 */
class MyCalendarThree {

    TreeMap<Integer, Integer> treeMap;

    public MyCalendarThree() {
        treeMap = new TreeMap<>();
    }

    public int book(int start, int end) {
        treeMap.put(start, treeMap.getOrDefault(start, 0) + 1);
        treeMap.put(end, treeMap.getOrDefault(end, 0) - 1);

        int active = 0;
        int result = 0;
        for (int v : treeMap.values()) {
            active += v;
            result = Math.max(result, active);
        }
        return result;
    }
}