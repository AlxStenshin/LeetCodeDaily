package day_038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/numbers-with-same-consecutive-differences/">
 *      967. Numbers With Same Consecutive Differences</a>
 * <p>
 * Return all non-negative integers of length n
 * such that the absolute difference between every two consecutive digits is k.
 * <p>
 * Note that every number in the answer must not have leading zeros.
 * For example, 01 has one leading zero and is invalid.
 * <p>
 * You may return the answer in any order.
 */

public class NumbersWithSameConsecutiveDifferences {

    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        while (--n > 0) {
            List<Integer> tmp = new ArrayList<>();
            for (int val : list) {
                int rem = val % 10;
                if (rem + k < 10)
                    tmp.add(val * 10 + rem + k);
                if (k != 0 && rem - k >= 0)
                    tmp.add(val * 10 + rem - k);
            }
            list = tmp;
        }
        return list.stream().mapToInt(j -> j).toArray();
    }
}
