package day_071;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * <a href=https://leetcode.com/problems/time-based-key-value-store/">
 *   981. Time Based Key-Value Store</a>
 * <p>
 * Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp. *
 * <p>
 * Implement the TimeMap class:
 * <p>
 * TimeMap() Initializes the object of the data structure.
 * <p>
 * void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
 *  <p>
 * String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 */

public class TimeMapTreeMap {
    private final Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMapTreeMap() {
        this.timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> timeMapValue;

        if (timeMap.containsKey(key))
            timeMapValue = timeMap.get(key);
        else {
            timeMapValue = new TreeMap<>();
            timeMap.put(key, timeMapValue);
        }
        timeMapValue.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (timeMap.containsKey(key)) {
            TreeMap<Integer, String> timeMapValue = timeMap.get(key);
            Integer nearestKey = timeMapValue.floorKey(timestamp);
            if (nearestKey != null)
                return timeMapValue.get(nearestKey);
        }
        return "";
    }
}
