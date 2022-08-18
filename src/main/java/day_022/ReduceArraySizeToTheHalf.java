package day_022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 1338. Reduce Array Size to The Half
 * https://leetcode.com/problems/reduce-array-size-to-the-half
 *
 * You are given an integer array arr.
 * You can choose a set of integers and remove all the occurrences of these integers in the array.
 *
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 */

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {

        int size = arr.length;
        int targetSize = size / 2;
        int currentSize = 0;
        int minimumSet = 0;

        // Get the frequency and sort them in descending order.
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) map.put(element, map.getOrDefault(element, 0) + 1);

        ArrayList<Integer> freq = new ArrayList<>(map.values());
        freq.sort(Collections.reverseOrder());

        // While the total elements are less than required add them and increment sets.
        while (currentSize < targetSize) {
            currentSize += freq.remove(0);
            minimumSet++;
        }

        return minimumSet;
    }
}
