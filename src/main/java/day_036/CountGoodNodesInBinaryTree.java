package day_036;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/">1448. Count Good Nodes in Binary Tree</a>
 * <p>
 * Given a binary tree root,
 * a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 */

public class CountGoodNodesInBinaryTree {
    int count;
    public int goodNodes(TreeNode root) {
        countGoodNodes(root, root.val);
        return count;
    }

    private void countGoodNodes(TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) {
                count++;
            }

            countGoodNodes(root.left, Math.max(root.val, max));
            countGoodNodes(root.right, Math.max(root.val, max));
        }
    }
}
