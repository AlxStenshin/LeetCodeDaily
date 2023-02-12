package day_200;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/shortest-path-with-alternating-colors/">
 * 1129. Shortest Path with Alternating Colors </a>
 * <p>
 * There is a tree (i.e., a connected, undirected graph with no cycles) structure country network consisting of n cities numbered from 0 to n - 1 and exactly n - 1 roads. The capital city is city 0. You are given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.
 * <p>
 * There is a meeting for the representatives of each city. The meeting is in the capital city.
 * <p>
 * There is a car in each city. You are given an integer seats that indicates the number of seats in each car.
 * <p>
 * A representative can use the car in their city to travel or change the car and ride with another representative. The cost of traveling between two cities is one liter of fuel.
 * <p>
 * Return the minimum number of liters of fuel to reach the capital city.You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1. Each edge is red or blue in this graph, and there could be self-edges and parallel edges.
 */

public class MinimumFuelCostToReportToTheCapital {
    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph = new List[roads.length + 1];

        for (int i = 0; i < graph.length; ++i)
            graph[i] = new ArrayList<>();

        for (int[] road : roads) {
            final int u = road[0];
            final int v = road[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(graph, 0, -1, seats);
        return ans;
    }

    private long ans = 0;

    private int dfs(List<Integer>[] graph, int u, int prev, int seats) {
        int people = 1;
        for (final int v : graph[u]) {
            if (v == prev)
                continue;
            people += dfs(graph, v, u, seats);
        }
        if (u > 0)
            ans += (people + seats - 1) / seats;
        return people;
    }

}
