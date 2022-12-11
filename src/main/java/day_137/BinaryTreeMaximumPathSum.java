package day_137;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/binary-tree-maximum-path-sum/">
 * 124. Binary Tree Maximum Path Sum </a>
 * <p>
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * <p>
 * The path sum of a path is the sum of the node's values in the path.
 * <p>
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 */

public class BinaryTreeMaximumPathSum {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getNodeSum(root);
        return maxSum;
    }

    private int getNodeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = getNodeSum(root.left);
        int rightSum = getNodeSum(root.right);

        maxSum = Math.max(maxSum, root.val + Math.max(leftSum, 0) + Math.max(rightSum, 0));
        return root.val + Math.max(0, Math.max(leftSum, rightSum));
    }
}
