package day_319;

import java.util.TreeMap;

/**
 * <a href = "https://leetcode.com/problems/snapshot-array/" >
 * 1146. Snapshot Array </a>
 * <p>
 * Implement a SnapshotArray that supports the following interface:
 * <p>
 * SnapshotArray(int length) initializes an array-like data structure with the given length. Initially, each element equals 0.<br>
 * void set(index, val) sets the element at the given index to be equal to val.<br>
 * int snap() takes a snapshot of the array and returns the snap_id: the total number of times we called snap() minus 1.<br>
 * int get(index, snap_id) returns the value at the given index, at the time we took the snapshot with the given snap_id<br>
 */

public class SnapshotArray {

    TreeMap<Integer, Integer>[] storage;
    int snap_id = 0;

    public SnapshotArray(int length) {
        storage = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            storage[i] = new TreeMap<>();
            storage[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        storage[index].put(snap_id, val);
    }

    public int snap() {
        return snap_id++;
    }

    public int get(int index, int snap_id) {
        return storage[index].floorEntry(snap_id).getValue();
    }
}
