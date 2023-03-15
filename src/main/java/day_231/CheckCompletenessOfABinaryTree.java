package day_231;

import utils.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/check-completeness-of-a-binary-tree/">
 * 958. Check Completeness of a Binary Tree </a>
 * <p>
 * Given the root of a binary tree, determine if it is a complete binary tree.
 * <p>
 * In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 */

public class CheckCompletenessOfABinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        while (queue.peek() != null) {
            TreeNode node = queue.poll();
            queue.offer(node.left);
            queue.offer(node.right);
        }

        while (!queue.isEmpty() && queue.peek() == null)
            queue.poll();

        return queue.isEmpty();
    }

}
