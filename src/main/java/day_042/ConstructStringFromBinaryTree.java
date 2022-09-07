package day_042;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/construct-string-from-binary-tree/">606. Construct String from Binary Tree</a>
 * <p>
 * Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree
 * with the preorder traversal way, and return it.
 * <p>
 * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string
 * and the original binary tree.
 */

public class ConstructStringFromBinaryTree {
    StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        appendNodeAsString(root);
        return sb.toString();
    }

    void appendNodeAsString(TreeNode node) {
        if (node == null)
            return;

        sb.append(node.val);

        if ((node.left != null) || (node.right != null)) {
            sb.append('(');
            appendNodeAsString(node.left);
            sb.append(')');
        }

        if (node.right != null) {
            sb.append('(');
            appendNodeAsString(node.right);
            sb.append(')');
        }
    }
}
