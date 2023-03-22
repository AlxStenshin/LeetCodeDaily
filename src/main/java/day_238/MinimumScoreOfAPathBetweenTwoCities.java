package day_238;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/">
 * 2492. Minimum Score of a Path Between Two Cities </a>
 * <p>
 * You are given a positive integer n representing n cities numbered from 1 to n. You are also given a 2D array roads where roads[i] = [ai, bi, distancei] indicates that there is a bidirectional road between cities ai and bi with a distance equal to distancei. The cities graph is not necessarily connected.
 * <p>
 * The score of a path between two cities is defined as the minimum distance of a road in this path.
 * <p>
 * Return the minimum possible score of a path between cities 1 and n.
 * <p>
 * Note:
 * <p>
 * A path is a sequence of roads between two cities.<br>
 * It is allowed for a path to contain the same road multiple times, and you can visit cities 1 and n multiple times along the path.<br>
 * The test cases are generated such that there is at least one path between 1 and n.
 */

public class MinimumScoreOfAPathBetweenTwoCities {
    public int minScore(int n, int[][] roads) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] road : roads) {
            int first = road[0];
            int second = road[1];
            int dist = road[2];

            graph.computeIfAbsent(first, k -> new HashMap<>()).put(second, dist);
            graph.computeIfAbsent(second, k -> new HashMap<>()).put(first, dist);
        }

        int res = Integer.MAX_VALUE;
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Map.Entry<Integer, Integer> entry : graph.get(node).entrySet()) {
                int adj = entry.getKey(), score = entry.getValue();
                if (!visited.contains(adj)) {
                    queue.offer(adj);
                    visited.add(adj);
                }
                res = Math.min(res, score);
            }
        }

        return res;
    }
}
