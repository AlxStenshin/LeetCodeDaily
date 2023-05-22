package day_299;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/top-k-frequent-elements/" >
 * 347. Top K Frequent Elements </a>
 * <p>
 * Given a directed acyclic graph, with n vertices numbered from 0 to n-1, and an array edges where edges[i] = [fromi, toi] represents a directed edge from node fromi to node toi.
 * <p>
 * Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists.
 * <p>
 * Notice that you can return the vertices in any order.
 */

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        for (int num : freqMap.keySet()) {
            heap.offer(num);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
