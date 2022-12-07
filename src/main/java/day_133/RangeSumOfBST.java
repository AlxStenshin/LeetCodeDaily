package day_133;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/range-sum-of-bst/">
 *  938. Range Sum of BST </a>
 * <p>
 * Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
 */

public class RangeSumOfBST {

    // Optimized Solution
    public int rangeSumBSTOptimized(TreeNode root, int low, int high) {
        TreeNode node = root;
        int sum = 0;

        if (node != null) {
            node = findRoot(node, low, high);
            sum += searchSum(node, low, high);
        }
        return sum;
    }

    private static int searchSum(TreeNode node, int low, int high) {
        int sum = 0;

        if (node.left != null) sum += searchSum(node.left, low, high);
        if (node.right != null) sum += searchSum(node.right, low, high);
        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }
        return sum;
    }

    private static TreeNode findRoot(TreeNode node, int low, int high) {
        while (!(node.val >= low && node.val <= high)) {
            if (node.val > low) node = node.left;
            if (node.val < low) node = node.right;
        }
        return node;
    }
    // -

    // Simplified Solution
    public int rangeSumBSTSimplified(TreeNode root, int low, int high) {
        int sum = 0;

        if (root != null && root.val >= low && root.val <= high)
            sum += root.val;

        if (root.left != null)
            sum += rangeSumBSTSimplified(root.left, low, high);

        if (root.right != null)
            sum += rangeSumBSTSimplified(root.right, low, high);

        return sum;
    }
    // -

    // Basic Solution
    int rangeSum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return rangeSum;
    }

    void helper(TreeNode node, int low, int high) {
        if (node != null) {
            if (node.val >= low && node.val <= high)
                rangeSum += node.val;
            helper(node.left, low, high);
            helper(node.right, low, high);
        }
    }
    // -
}