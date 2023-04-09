package day_256;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/largest-color-value-in-a-directed-graph/">
 * 1857. Largest Color Value in a Directed Graph </a>
 * <p>
 * There is a directed graph of n colored nodes and m edges. The nodes are numbered from 0 to n - 1.
 * <p>
 * You are given a string colors where colors[i] is a lowercase English letter representing the color of the ith node in this graph (0-indexed). You are also given a 2D array edges where edges[j] = [aj, bj] indicates that there is a directed edge from node aj to node bj.
 * <p>
 * A valid path in the graph is a sequence of nodes x1 -> x2 -> x3 -> ... -> xk such that there is a directed edge from xi to xi+1 for every 1 <= i < k. The color value of the path is the number of nodes that are colored the most frequently occurring color along that path.
 * <p>
 * Return the largest color value of any valid path in the given graph, or -1 if the graph contains a cycle.
 */

public class LargestColorValueInADirectedGraph {
    public int largestPathValue(String colors, int[][] edges) {
        int size = colors.length();
        int[] indegrees = new int[size];

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegrees[edge[1]]++;
        }

        Queue<Integer> zeroIndegree = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (indegrees[i] == 0) {
                zeroIndegree.offer(i);
            }
        }

        int[][] counts = new int[size][26];
        for (int i = 0; i < size; i++) {
            counts[i][colors.charAt(i) - 'a']++;
        }

        int maxCount = 0;
        int visited = 0;
        while (!zeroIndegree.isEmpty()) {
            int u = zeroIndegree.poll();
            visited++;
            for (int v : graph.get(u)) {
                for (int i = 0; i < 26; i++) {
                    counts[v][i] = Math.max(counts[v][i], counts[u][i] + (colors.charAt(v) - 'a' == i ? 1 : 0));
                }
                indegrees[v]--;
                if (indegrees[v] == 0) {
                    zeroIndegree.offer(v);
                }
            }
            maxCount = Math.max(maxCount, Arrays.stream(counts[u]).max().orElse(-1));
        }

        return visited == size ? maxCount : -1;

    }
}