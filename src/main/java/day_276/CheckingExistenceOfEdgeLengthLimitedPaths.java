package day_276;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href = "https://leetcode.com/problems/bulb-switcher/" >
 * 1697. Checking Existence of Edge Length Limited Paths </a>
 * <p>
 * An undirected graph of n nodes is defined by edgeList, where edgeList[i] = [ui, vi, disi] denotes an edge between nodes ui and vi with distance disi. Note that there may be multiple edges between two nodes.
 * <p>
 * Given an array queries, where queries[j] = [pj, qj, limitj], your task is to determine for each queries[j] whether there is a path between pj and qj such that each edge on the path has a distance strictly less than limitj .
 * <p>
 * Return a boolean array answer, where answer.length == queries.length and the jth value of answer is true if there is a path for queries[j] is true, and false otherwise.
 */

public class CheckingExistenceOfEdgeLengthLimitedPaths {
    private int[] parent;
    private int[] size;
    private int[] weight;

    public boolean[] distanceLimitedPathsExist(int length, int[][] adjList, int[][] queries) {
        parent = new int[length];
        size = new int[length];
        weight = new int[length];
        for (int i = 0; i < length; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        Arrays.sort(adjList, Comparator.comparingInt(a -> a[2]));
        for (int[] edge : adjList) unionBySize(edge[0], edge[1], edge[2]);

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++)
            answer[i] = isConnectedAndWithinLimit(queries[i][0], queries[i][1], queries[i][2]);

        return answer;
    }

    private void unionBySize(int x, int y, int limit) {
        int x_ref = find(x, Integer.MAX_VALUE);
        int y_ref = find(y, Integer.MAX_VALUE);
        if (x_ref != y_ref) {
            if (size[x_ref] < size[y_ref]) {
                parent[x_ref] = y_ref;
                weight[x_ref] = limit;
                size[y_ref] += size[x_ref];
            } else {
                parent[y_ref] = x_ref;
                weight[y_ref] = limit;
                size[x_ref] += size[y_ref];
            }
        }
    }

    private int find(int x, int limit) {
        while (x != parent[x]) {
            if (weight[x] >= limit) {
                break;
            }
            x = parent[x];
        }
        return x;
    }

    public boolean isConnectedAndWithinLimit(int p, int q, int limit) {
        return find(p, limit) == find(q, limit);
    }
}
