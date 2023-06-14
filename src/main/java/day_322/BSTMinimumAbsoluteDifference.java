package day_322;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/minimum-absolute-difference-in-bst/" >
 * 530. Minimum Absolute Difference in BST </a>
 * <p>
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
 */

public class BSTMinimumAbsoluteDifference {

    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode root) {
        if (root.left != null)
            inOrder(root.left);

        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;

        if (root.right != null)
            inOrder(root.right);
    }
}
