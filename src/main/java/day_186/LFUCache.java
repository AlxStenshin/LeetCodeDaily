package day_186;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/lfu-cache/">
 * 460. LFU Cache </a>
 * <p>
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * <p>
 * Implement the LFUCache class:
 * <p>
 * LFUCache(int capacity) Initializes the object with the capacity of the data structure.<br>
 * int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.<br><p>
 * void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.<br><p>
 * To determine the least frequently used key, a use counter is maintained for each key in the cache. The key with the smallest use counter is the least frequently used key.<br>
 * <p>
 * When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation). The use counter for a key in the cache is incremented either a get or put operation is called on it.
 * <p>
 * The functions get and put must each run in O(1) average time complexity.
 */

public class LFUCache {

    private final int capacity;
    private int minFreq = 0;
    private final Map<Integer, Integer> keyToVal = new HashMap<>();
    private final Map<Integer, Integer> keyToFreq = new HashMap<>();
    private final Map<Integer, LinkedHashSet<Integer>> freqToLFUKeys = new HashMap<>();


    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(int key, int value) {
        if (capacity == 0)
            return;
        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            get(key);
            return;
        }

        if (keyToVal.size() == capacity) {
            final int keyToEvict = freqToLFUKeys.get(minFreq).iterator().next();
            freqToLFUKeys.get(minFreq).remove(keyToEvict);
            keyToVal.remove(keyToEvict);
        }

        minFreq = 1;
        change(key, minFreq);
        keyToVal.put(key, value);
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key))
            return -1;

        final int freq = keyToFreq.get(key);
        freqToLFUKeys.get(freq).remove(key);
        if (freq == minFreq && freqToLFUKeys.get(freq).isEmpty()) {
            freqToLFUKeys.remove(freq);
            ++minFreq;
        }

        change(key, freq + 1);
        return keyToVal.get(key);
    }

    private void change(int key, int freq) {
        keyToFreq.put(key, freq);
        freqToLFUKeys.putIfAbsent(freq, new LinkedHashSet<>());
        freqToLFUKeys.get(freq).add(key);
    }

}
