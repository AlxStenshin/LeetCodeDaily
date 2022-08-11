package day_015;

import utils.tree.TreeNode;

/**
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * <p>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long min, long max){
        if (root == null) {
            return true;
        }

        // Root value must be greater than or equal to min and lesser than or equal to max
        if (root.val <= min || root.val >= max) {
            return false;
        }

        boolean leftValid = isValidBST(root.left, min, root.val);
        boolean rightValid = isValidBST(root.right, root.val, max);
        return leftValid && rightValid;
    }
}
