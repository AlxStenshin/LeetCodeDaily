package day_040;

import utils.tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-level-order-traversal/">429. N-ary Tree Level Order Traversal</a>
 * <p>
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value (See examples).
 */

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> level = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        level.add(root);
        while (!level.isEmpty()) {
            int n = level.size();
            List<Integer> current = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                Node node = level.poll();
                current.add(node.val);
                level.addAll(node.children);
            }
            result.add(current);
        }
        return result;
    }
}