package day_126;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <a href = "https://leetcode.com/problems/unique-number-of-occurrences/">
 * 1207. Unique Number of Occurrences </a>
 * <p>
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
 */

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashSet<Integer> uniqueOccurrence = new HashSet<>();

        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for (var entry : freqMap.entrySet()) {
            if (!uniqueOccurrence.add(entry.getValue()))
                return false;
        }
        return true;
    }
}
