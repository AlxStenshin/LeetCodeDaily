package day_071;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href=https://leetcode.com/problems/time-based-key-value-store/">
 *   981. Time Based Key-Value Store</a>
 * <p>
 *     Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp. *
 * <p>
 * Implement the TimeMap class:
 * <p>
 * TimeMap() Initializes the object of the data structure.
 * <p>
 * void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
 *  <p>
 * String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 */

public class TimeMapHashMaps {
    private final Map<String, HashMap<Integer, String>> timeMap;

    public TimeMapHashMaps() {
        this.timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        HashMap<Integer, String> timeMapValue;

        if (timeMap.containsKey(key))
            timeMapValue = timeMap.get(key);
        else {
            timeMapValue = new HashMap<>();
            timeMap.put(key, timeMapValue);
        }
        timeMapValue.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (timeMap.containsKey(key)) {
            HashMap<Integer, String> timeMapValue = timeMap.get(key);
            if (timeMapValue.containsKey(timestamp))
                return timeMapValue.get(timestamp);

            int targetKey = timeMapValue.keySet().stream()
                    .filter(e -> e <= timestamp)
                    .reduce(Integer::max).orElse(-1);

            if (targetKey > 0)
                return timeMapValue.get(targetKey);
        }
        return "";
    }
}
