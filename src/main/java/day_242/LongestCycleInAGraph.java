package day_242;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/longest-cycle-in-a-graph/">
 * 2360. Longest Cycle in a Graph </a>
 * <p>
 * You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.
 * <p>
 * The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge from node i to node edges[i]. If there is no outgoing edge from node i, then edges[i] == -1.
 * <p>
 * Return the length of the longest cycle in the graph. If no cycle exists, return -1.
 * <p>
 * A cycle is a path that starts and ends at the same node.
 */

public class LongestCycleInAGraph {
    int answer = -1;

    public int longestCycle(int[] edges) {
        int size = edges.length;
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                Map<Integer, Integer> dist = new HashMap<>();
                dist.put(i, 1);
                dfs(i, edges, dist, visited);
            }
        }
        return answer;
    }

    public void dfs(int node, int[] edges, Map<Integer, Integer> dist, boolean[] visited) {
        visited[node] = true;
        int neighbor = edges[node];

        if (neighbor != -1 && !visited[neighbor]) {
            dist.put(neighbor, dist.get(node) + 1);
            dfs(neighbor, edges, dist, visited);
        } else if (neighbor != -1 && dist.containsKey(neighbor)) {
            answer = Math.max(answer, dist.get(node) - dist.get(neighbor) + 1);
        }
    }

}
