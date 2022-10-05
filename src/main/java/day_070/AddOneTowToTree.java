package day_070;

import utils.tree.TreeNode;

/**
 * <a href=https://leetcode.com/problems/add-one-row-to-tree/">
 *   623. Add One Row to Tree/a>
 * <p>
 *    Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.
 * <p>
 * Note that the root node is at depth 1.
 * <p>
 * The adding rule is:
 * <p>
 * Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.<p>
 * cur's original left subtree should be the left subtree of the new left subtree root.<p>
 * cur's original right subtree should be the right subtree of the new right subtree root.<p>
 * If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.
 */

public class AddOneTowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null)
            return null;

        if (depth == 1)
            return new TreeNode(val, root, null);

        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            addOneRow(root.left, val, depth - 1);
            addOneRow(root.right, val, depth - 1);
        }

        return root;
    }
}
