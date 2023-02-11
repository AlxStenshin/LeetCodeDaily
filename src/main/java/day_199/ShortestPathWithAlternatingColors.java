package day_199;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/shortest-path-with-alternating-colors/">
 * 1129. Shortest Path with Alternating Colors </a>
 * <p>
 * You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1. Each edge is red or blue in this graph, and there could be self-edges and parallel edges.
 * <p>
 * You are given two arrays redEdges and blueEdges where:
 * <p>
 * redEdges[i] = [ai, bi] indicates that there is a directed red edge from node ai to node bi in the graph, and<br>
 * blueEdges[j] = [uj, vj] indicates that there is a directed blue edge from node uj to node vj in the graph.
 * <p>
 * Return an array answer of length n, where each answer[x] is the length of the shortest path from node 0 to node x such that the edge colors alternate along the path, or -1 if such a path does not exist.
 */

public class ShortestPathWithAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<List<Integer>> firstList = new ArrayList<>();
        List<List<Integer>> secondList = new ArrayList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            firstList.add(new ArrayList<>());
            secondList.add(new ArrayList<>());
        }

        for (int[] r : redEdges) {
            firstList.get(r[0]).add(r[1]);
        }

        for (int[] b : blueEdges) {
            secondList.get(b[0]).add(b[1]);
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        q.add(new Pair(0, 1));

        boolean[][] visited = new boolean[n][2];
        visited[0][1] = true;
        visited[0][0] = true;
        ans[0] = 0;
        int level = 1;

        while (!q.isEmpty()) {
            int sz = q.size();
            System.out.println(sz);
            while (sz-- > 0) {
                Pair curr = q.poll();
                int value = curr.getKey();
                int color = curr.getValue();
                if (color == 0) {
                    for (int i : firstList.get(value)) {
                        if (!visited[i][0]) {
                            q.add(new Pair(i, 1));
                            if (ans[i] == -1) ans[i] = level;
                            visited[i][0] = true;
                        }
                    }
                } else {
                    for (int i : secondList.get(value)) {
                        if (!visited[i][1]) {
                            q.add(new Pair(i, 0));
                            if (ans[i] == -1) ans[i] = level;
                            visited[i][1] = true;
                        }
                    }
                }
            }
            level++;
        }
        return ans;
    }

    private static class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
