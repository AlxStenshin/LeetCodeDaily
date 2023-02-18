package day_206;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/invert-binary-tree/">
 * 226. Invert Binary Tree </a>
 * <p>
 * Given the root of a binary tree, invert the tree, and return its root.
 */

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
