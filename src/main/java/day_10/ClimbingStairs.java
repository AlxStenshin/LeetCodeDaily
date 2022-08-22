package day_10;

import java.util.HashMap;
import java.util.Map;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }

        Map<Integer, Integer> storage = new HashMap<>();
        storage.put(0, 0);
        storage.put(1, 1);
        storage.put(2, 2);

        return climbWithStorage(n, storage);
    }

    private int climbWithStorage(int n, Map<Integer, Integer> storage) {
        if (!storage.containsKey(n)) {
            int currentSteps = climbWithStorage(n - 1, storage) + climbWithStorage(n - 2, storage);
            storage.put(n, currentSteps);
        }
        return storage.get(n);
    }
}
