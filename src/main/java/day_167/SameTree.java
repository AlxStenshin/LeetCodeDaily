package day_167;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/same-tree/">
 *     100. Same Tree </a>
 * <p>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null) && (q == null))
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
