package day_050;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/find-original-array-from-doubled-array/">
 *     2007. Find Original Array From Doubled Array</a>
 * <p>
 * An integer array original is transformed into a doubled array changed by appending twice the value
 * of every element in original, and then randomly shuffling the resulting array.
 * <p>
 * Given an array changed, return original if changed is a doubled array.
 * If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
 */
public class FindOriginalArrayFromDoubledArray {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0)
            return new int[]{};

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (Integer value : changed) {
            frequency.put(value, frequency.getOrDefault(value,0) + 1);
        }

        Arrays.sort(changed);
        int[] result = new int[changed.length/2];
        int currentResultSize = 0;

        for (int value : changed) {
            if (frequency.get(value) <= 0)
                continue;

            if (frequency.getOrDefault(2*value, 0) <= 0)
                return new int[]{};

            frequency.put(value, frequency.get(value)-1);
            frequency.put(value*2, frequency.get(value*2)-1);

            result[currentResultSize] = value;
            currentResultSize++;
        }

        return result;
    }
}
