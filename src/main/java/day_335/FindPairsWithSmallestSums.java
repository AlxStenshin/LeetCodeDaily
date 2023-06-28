package day_335;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/find-k-pairs-with-smallest-sums/" >
 * 373. Find K Pairs with Smallest Sums </a>
 * <p>
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 * <p>
 * Define a pair (u, v) which consists of one element from the first array and one element from the second array.
 * <p>
 * Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
 */

public class FindPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int x : nums1) {
            queue.offer(new int[]{x + nums2[0], 0});
        }
        while (k > 0 && !queue.isEmpty()) {
            int[] pair = queue.poll();
            int sum = pair[0];
            int pos = pair[1];

            List<Integer> currentPair = new ArrayList<>();
            currentPair.add(sum - nums2[pos]);
            currentPair.add(nums2[pos]);
            result.add(currentPair);

            if (pos + 1 < nums2.length) {
                queue.offer(new int[]{sum - nums2[pos] + nums2[pos + 1], pos + 1});
            }
            k--;
        }
        return result;
    }
}
