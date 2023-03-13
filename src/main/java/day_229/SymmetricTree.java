package day_229;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/linked-list-random-node/">
 * 101. Symmetric Tree </a>
 * <p>
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return mirrors(root.left, root.right);
    }

    private boolean mirrors(TreeNode left, TreeNode right) {
        if (left != null && right != null)
            return left.val == right.val &&
                    mirrors(left.left, right.right) &&
                    mirrors(left.right, right.left);
        else return left == null && right == null;
    }

}
