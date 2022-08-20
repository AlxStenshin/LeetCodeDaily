package day_08;

import utils.tree.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * <p>
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * <p>
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q
 * as descendants (where we allow a node to be a descendant of itself).”
 *
 */

public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            // Current value lesser than both descendants
            // going up and right
            if (root.val < p.val && root.val < q.val)
                root = root.right;

                // Current value greater than both descendants
                // going up and left
            else if (root.val > p.val && root.val > q.val)
                root = root.left;

                // LCA = root
            else {
                break;
            }
        }
        return root;
    }
}