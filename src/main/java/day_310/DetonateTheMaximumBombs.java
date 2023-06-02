package day_310;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/detonate-the-maximum-bombs/" >
 * 2101. Detonate the Maximum Bombs</a>
 * <p>
 * You are given a list of bombs. The range of a bomb is defined as the area where its effect can be felt. This area is in the shape of a circle with the center as the location of the bomb.
 * <p>
 * The bombs are represented by a 0-indexed 2D integer array bombs where bombs[i] = [xi, yi, ri]. xi and yi denote the X-coordinate and Y-coordinate of the location of the ith bomb, whereas ri denotes the radius of its range.
 * <p>
 * You may choose to detonate a single bomb. When a bomb is detonated, it will detonate all bombs that lie in its range. These bombs will further detonate the bombs that lie in their ranges.
 */

public class DetonateTheMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int maxBombs = 0;
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (Math.pow(bombs[i][2], 2) >= Math.pow(bombs[i][0] - bombs[j][0], 2) + Math.pow(bombs[i][1] - bombs[j][1], 2)) {
                    List<Integer> neighbors = graph.getOrDefault(i, new ArrayList<>());
                    neighbors.add(j);
                    graph.put(i, neighbors);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> visited = new HashSet<>();
            visited.add(i);
            dfs(i, visited, graph);
            maxBombs = Math.max(maxBombs, visited.size());
        }

        return maxBombs;
    }

    private void dfs(int node, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
        for (int child : neighbors) {
            if (!visited.contains(child)) {
                visited.add(child);
                dfs(child, visited, graph);
            }
        }
    }
}
