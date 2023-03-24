package day_240;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">
 * 1466. Reorder Routes to Make All Paths Lead to the City Zero </a>
 * <p>
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.
 * <p>
 * Roads are represented by connections where connections[i] = [ai, bi] represents a road from city ai to city bi.
 * <p>
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 * <p>
 * Your task consists of reorienting some roads such that each city can visit the city 0. Return the minimum number of edges changed.
 * <p>
 * It's guaranteed that each city can reach city 0 after reorder.
 *
 */

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            links.add(new ArrayList<>());

        for (var c : connections) {
            int start = c[0];
            int dest = c[1];

            links.get(start).add(dest);
            links.get(dest).add(-start);
        }

        return dfs(links, new boolean[n], 0);
    }

    int dfs(List<List<Integer>> links, boolean[] visited, int start) {
        int change = 0;
        visited[start] = true;
        for (var to : links.get(start))
            if (!visited[Math.abs(to)])
                change += dfs(links, visited, Math.abs(to)) + (to > 0 ? 1 : 0);

        return change;
    }

}
