package day_013;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 823. Binary Trees With Factors
 * https://leetcode.com/problems/binary-trees-with-factors/
 * <p>
 * Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
 * <p>
 * We make a binary tree using these integers, and each number may be used for any number of times.
 * Each non-leaf node's value should be equal to the product of the values of its children.
 * <p>
 * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 10^9 + 7.
 */

public class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Long> map = new HashMap<>();
        long ans = 1;
        map.put(arr[0], ans);

        for (int i = 1; i < arr.length; i++) {
            long sum = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j]))
                    sum = sum + (map.get(arr[i] / arr[j]) * map.get(arr[j]));
            }
            map.put(arr[i], sum);
            ans = ans + sum;
        }
        return (int) (ans % 100_000_000_7);
    }
}
