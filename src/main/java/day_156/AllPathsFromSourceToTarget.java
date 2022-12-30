package day_156;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/all-paths-from-source-to-target/">
 * 797. All Paths From Source to Target</a>
 * <p>
 * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.
 * <p>
 * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
 */

public class AllPathsFromSourceToTarget {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        getPaths(graph, 0, new ArrayList<>());
        return res;
    }

    private void getPaths(int[][] graph, int index, List<Integer> lst) {
        if (graph[index] == null || graph[index].length == 0)
            return;

        lst.add(index);
        int[] path = graph[index];
        for (int p : path) {
            if (p == graph.length - 1) {
                lst.add(p);
                res.add(new ArrayList<>(lst));
                lst.remove(lst.size() - 1);
            } else {
                getPaths(graph, p, lst);
            }
        }
        lst.remove(lst.size() - 1);
    }

}
