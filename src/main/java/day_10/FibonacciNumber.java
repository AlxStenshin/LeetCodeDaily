package day_10;

import java.util.HashMap;
import java.util.Map;

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */

public class FibonacciNumber {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        Map<Integer, Integer> fibStorage = new HashMap<>();
        fibStorage.put(0, 0);
        fibStorage.put(1, 1);

        return fibWithStorage(n, fibStorage);
    }

    private int fibWithStorage(int n, Map<Integer, Integer> storage) {
        if (!storage.containsKey(n)) {
            int currentFib = fibWithStorage(n - 1, storage) + fibWithStorage(n - 2, storage);
            storage.put(n, currentFib);
        }
        return storage.get(n);
    }
}
