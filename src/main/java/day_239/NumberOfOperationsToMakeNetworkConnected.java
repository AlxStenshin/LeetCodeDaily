package day_239;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/number-of-operations-to-make-network-connected/">
 * 1319. Number of Operations to Make Network Connected </a>
 * <p>
 * There are n computers numbered from 0 to n - 1 connected by ethernet cables connections forming a network where connections[i] = [ai, bi] represents a connection between computers ai and bi. Any computer can reach any other computer directly or indirectly through the network.
 * <p>
 * You are given an initial computer network connections. You can extract certain cables between two directly connected computers, and place them between any pair of disconnected computers to make them directly connected.
 * <p>
 * Return the minimum number of times you need to do this in order to make all the computers connected. If it is not possible, return -1.
 */

public class NumberOfOperationsToMakeNetworkConnected {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;

        List<Integer>[] network = new List[n];
        for (int i = 0; i < n; i++)
            network[i] = new ArrayList<>();

        for (int[] c : connections) {
            int from = c[0];
            int to = c[1];

            network[from].add(to);
            network[to].add(from);
        }

        int replacements = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            replacements += dfs(i, network, visited);
        }

        return replacements - 1;
    }

    int dfs(int u, List<Integer>[] graph, boolean[] visited) {
        if (visited[u])
            return 0;

        visited[u] = true;
        for (int v : graph[u])  {
            dfs(v, graph, visited);
        }
        return 1;
    }
}
