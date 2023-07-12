package day_350;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/find-eventual-safe-states/" >
 * 802. Find Eventual Safe States </a>
 * <p>
 * There is a directed graph of n nodes with each node labeled from 0 to n - 1. The graph is represented by a 0-indexed 2D integer array graph where graph[i] is an integer array of nodes adjacent to node i, meaning there is an edge from node i to each node in graph[i].
 * <p>
 * A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from that node leads to a terminal node (or another safe node).
 * <p>
 * Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.
 */

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int size = graph.length;
        int[] indegree = new int[size];

        List<List<Integer>> graphArray = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            graphArray.add(new ArrayList<>());
        }

        for (int i = 0; i < size; i++) {
            for (int itt : graph[i]) {
                graphArray.get(itt).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            answer.add(node);
            for (int it : graphArray.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0)
                    queue.add(it);
            }
        }

        answer.sort(null);
        return answer;
    }
}
