package day_136;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/">
 * 1339. Maximum Product of Splitted Binary Tree </a>
 * <p>
 * Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.
 * <p>
 * Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.
 * <p>
 * Note that you need to maximize the answer before taking the mod and not after taking it.
 */

public class MaximumProductOfSplittedBinaryTree {
    long max = 0;

    public int maxProduct(TreeNode root) {
        if (root == null)
            return 0;

        max = root.val;
        long total = sum(root);
        helper(root, total);
        return (int) (max % (Math.pow(10, 9) + 7));
    }

    private long helper(TreeNode root, long total) {
        if (root == null)
            return 0;

        long left = helper(root.left, total);
        long right = helper(root.right, total);

        long rem = total - left;
        max = Math.max(max, rem * left);
        rem = total - right;
        max = Math.max(max, rem * right);

        return left + right + root.val;
    }

    private long sum(TreeNode root) {
        if (root == null) return 0;
        long left = sum(root.left);
        long right = sum(root.right);
        return left + right + root.val;
    }
}
