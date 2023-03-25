package day_241;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/">
 * 2316. Count Unreachable Pairs of Nodes in an Undirected Graph </a>
 * <p>
 * ou are given an integer n. There is an undirected graph with n nodes, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting nodes ai and bi.
 * <p>
 * Return the number of pairs of different nodes that are unreachable from each other.
 */

public class CountUnreachablePairsOfNodesInAnUndirectedGraph {
    List<Integer>[] graph;

    public long countPairs(int n, int[][] edges) {
        graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            int from = e[0];
            int to = e[1];

            graph[from].add(to);
            graph[to].add(from);
        }

        boolean[] visited = new boolean[n];
        int visitedCount = 0;
        long unreaachableCount = 0;

        for (int node = 0; node < n; ++node) {
            if (!visited[node]) {
                int connectedNodesCount = dfs(node, visited);
                unreaachableCount += (long) connectedNodesCount * visitedCount;
                visitedCount += connectedNodesCount;
            }
        }
        return unreaachableCount;
    }

    private int dfs(int node, boolean[] visited) {
        visited[node] = true;
        int connectedNodesCount = 1;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                connectedNodesCount += dfs(neighbor, visited);
            }
        }
        return connectedNodesCount;
    }

}
