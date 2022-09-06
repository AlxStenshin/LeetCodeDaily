package day_041;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/binary-tree-pruning/">814. Binary Tree Pruning</a>
 * <p>
 * Given the root of a binary tree, return the same tree where every subtree (of the given tree)
 * not containing a 1 has been removed.
 * <p>
 * A subtree of a node node is node plus every node that is a descendant of node.
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        return reorder(root);
    }

    private TreeNode reorder(TreeNode current) {
        if (current == null) {
            return null;
        }

        TreeNode left = reorder(current.left);
        TreeNode right = reorder(current.right);

        if (left == null) {
            current.left = null;
        }
        if (right == null) {
            current.right = null;
        }
        if (left == null && right == null && current.val == 0) {
            return null;
        }
        return current;
    }
}