package day_307;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/design-hashset/" >
 * 705. Design HashSet </a>
 * <p>
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * Implement MyHashSet class:
 * <p>
 * void add(key) Inserts the value key into the HashSet.<br>
 * bool contains(key) Returns whether the value key exists in the HashSet or not.<br>
 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.<br>
 */

public class MyHashSet {

    private final int size;
    private final List<List<Integer>> buckets;

    public MyHashSet() {
        size = 1000;
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        return bucket.contains(key);
    }

    private int hash(int key) {
        return key % size;
    }
}
