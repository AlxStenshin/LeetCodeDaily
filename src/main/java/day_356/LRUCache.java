package day_356;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/lru-cache/" >
 * 146. LRU Cache </a>
 * <p>
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * <p>
 * Implement the LRUCache class:
 * <li>LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * <li> int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * <li>void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * <p>
 * The functions get and put must each run in O(1) average time complexity.
 */

class LRUCache {

    private final LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;

    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}