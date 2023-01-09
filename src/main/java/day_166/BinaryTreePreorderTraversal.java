package day_166;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">
 *     144. Binary Tree Preorder Traversal </a>
 * <p>
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */

public class BinaryTreePreorderTraversal {

    List<Integer> traversal = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            traversal.add(root.val);
            if (root.left != null)
                preorderTraversal(root.left);
            if (root.right != null)
                preorderTraversal(root.right);
            else
                return traversal;
        }
        return traversal;
    }
}
