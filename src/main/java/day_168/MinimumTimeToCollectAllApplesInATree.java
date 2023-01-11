package day_168;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/">
 *     1443. Minimum Time to Collect All Apples in a Tree </a>
 * <p>
 * Given an undirected tree consisting of n vertices numbered from 0 to n-1, which has some apples in their vertices. You spend 1 second to walk over one edge of the tree. Return the minimum time in seconds you have to spend to collect all apples in the tree, starting at vertex 0 and coming back to this vertex.
 * <p>
 * The edges of the undirected tree are given in the array edges, where edges[i] = [ai, bi] means that exists an edge connecting the vertices ai and bi. Additionally, there is a boolean array hasApple, where hasApple[i] = true means that vertex i has an apple; otherwise, it does not have any apple.
 */

public class MinimumTimeToCollectAllApplesInATree {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> nodeNeighbors = new HashMap<>();

        for (int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            nodeNeighbors.computeIfAbsent(start, value -> new ArrayList<>()).add(end);
            nodeNeighbors.computeIfAbsent(end, value -> new ArrayList<>()).add(start);
        }
        return calcTime(0, -1, nodeNeighbors, hasApple);
    }

    public int calcTime(int node, int parent, Map<Integer, List<Integer>> adj, List<Boolean> hasApple) {
        if (!adj.containsKey(node))
            return 0;

        int totalTime = 0;
        int childTime = 0;
        for (int child : adj.get(node)) {
            if (child == parent)
                continue;
            childTime = calcTime(child, node, adj, hasApple);

            if (childTime > 0 || hasApple.get(child))
                totalTime += childTime + 2;
        }
        return totalTime;
    }
}
