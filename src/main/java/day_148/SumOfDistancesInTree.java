package day_148;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/sum-of-distances-in-tree/">
 * 834. Sum of Distances in Tree </a>
 * <p>
 * There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 * <p>
 * You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 * <p>
 * Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.
 */

public class SumOfDistancesInTree {

    private int[] res;
    private int[] count;
    private List<HashSet<Integer>> tree;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        tree = new ArrayList<>();
        res = new int[n];
        count = new int[n];

        for (int i = 0; i < n; i++) {
            tree.add(new HashSet<>());
        }

        for (int[] e : edges) {
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }

        postOrder(0, -1);
        preOrder(0, -1);

        return res;
    }

    private void postOrder(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) {
                continue;
            }
            postOrder(i, root);
            count[root] += count[i];
            res[root] += res[i] + count[i];
        }
        count[root]++;
    }

    private void preOrder(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) {
                continue;
            }
            res[i] = res[root] - count[i] + count.length - count[i];
            preOrder(i, root);
        }
    }

}
