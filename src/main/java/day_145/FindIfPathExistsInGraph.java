package day_145;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/find-if-path-exists-in-graph/">
 * 1971. Find if Path Exists in Graph </a>
 * <p>
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
 * <p>
 * You want to determine if there is a valid path that exists from vertex source to vertex destination.
 * <p>
 * Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
 */

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int enter = edge[0];
            int exit = edge[1];

            graph.computeIfAbsent(enter, val -> new ArrayList<>()).add(exit);
            graph.computeIfAbsent(exit, val -> new ArrayList<>()).add(enter);
        }

        boolean[] visited = new boolean[n];
        visited[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == destination) {
                return true;
            }

            for (int nextNode : graph.get(currNode)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }

        return false;
    }
}
