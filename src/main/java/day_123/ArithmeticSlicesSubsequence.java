package day_123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/arithmetic-slices-ii-subsequence/">
 * 446. Arithmetic Slices II - Subsequence </a>
 * <p>
 * Given an integer array nums, return the number of all the arithmetic subsequences of nums.
 * <p>
 * A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 * <p>
 * For example, [1, 3, 5, 7, 9], [7, 7, 7, 7], and [3, -1, -5, -9] are arithmetic sequences.<br>
 * For example, [1, 1, 2, 5, 7] is not an arithmetic sequence.<br>
 * A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.<br>
 * <p>
 * For example, [2,5,10] is a subsequence of [1,2,1,2,4,1,5,10].<br>
 */

public class ArithmeticSlicesSubsequence {

    public int numberOfArithmeticSlices_DP(int[] A) {
        int n = A.length;
        long ans = 0;
        Map<Integer, Integer>[] cnt = new Map[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = new HashMap<>(i);
            for (int j = 0; j < i; j++) {
                long delta = (long)A[i] - (long)A[j];
                if (delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE) {
                    continue;
                }
                int diff = (int)delta;
                int sum = cnt[j].getOrDefault(diff, 0);
                int origin = cnt[i].getOrDefault(diff, 0);
                cnt[i].put(diff, origin + sum + 1);
                ans += sum;
            }
        }
        return (int)ans;
    }

    private int n;
    private int ans;

    public int numberOfArithmeticSlices(int[] A) {
        n = A.length;
        ans = 0;
        List<Long> cur = new ArrayList<>();
        dfs(0, A, cur);
        return ans;
    }

    private void dfs(int dep, int[] A, List<Long> cur) {
        if (dep == n) {
            if (cur.size() < 3) {
                return;
            }
            long diff = cur.get(1) - cur.get(0);
            for (int i = 1; i < cur.size(); i++) {
                if (cur.get(i) - cur.get(i - 1) != diff) {
                    return;
                }
            }
            ans++;
            return;
        }
        dfs(dep + 1, A, cur);
        cur.add((long) A[dep]);
        dfs(dep + 1, A, cur);
        cur.remove((long) A[dep]);
    }
}
