package day_135;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/">
 *  1026. Maximum Difference Between Node and Ancestor </a>
 * <p>
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
 * <p>
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 */

public class MaximumDifferenceBetweenNodeAndAncestor {
    int result = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return result;

        helper(root, root.val);
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
        return result;
    }

    private void helper(TreeNode node, int rootVal) {
        if (node == null)
            return;

        result = Math.max(result, Math.abs(rootVal - node.val));
        helper(node.left, rootVal);
        helper(node.right, rootVal);
    }
}
