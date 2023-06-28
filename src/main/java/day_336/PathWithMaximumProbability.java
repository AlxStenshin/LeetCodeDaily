package day_336;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/path-with-maximum-probability/" >
 * 1514. Path with Maximum Probability </a>
 * <p>
 * You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].
 * <p>
 * Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.
 * <p>
 * If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.
 */

public class PathWithMaximumProbability {

    public double maxProbability(int n, int[][] edges, double[] s, int start, int end) {
        List<Pair>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            g[edges[i][0]].add(new Pair(edges[i][1], s[i]));
            g[edges[i][1]].add(new Pair(edges[i][0], s[i]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.prob < b.prob) return 1;
            else if (a.prob > b.prob) return -1;
            return 0;
        });
        pq.offer(new Pair(start, 1));

        Set<Integer> visited = new HashSet<>();

        double res = Integer.MIN_VALUE;

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            if (cur.node == end) res = Math.max(res, cur.prob);
            visited.add(cur.node);
            for (Pair next : g[cur.node]) {
                if (!visited.contains(next.node)) {
                    pq.offer(new Pair(next.node, next.prob * cur.prob));
                }
            }

        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }

    static class Pair {
        int node;
        double prob;

        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
}
