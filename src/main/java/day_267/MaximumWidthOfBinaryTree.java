package day_267;

import utils.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/maximum-width-of-binary-tree/">
 * 662. Maximum Width of Binary Tree </a>
 * <p>
 * Given the root of a binary tree, return the maximum width of the given tree.
 * <p>
 * The maximum width of a tree is the maximum width among all levels.
 * <p>
 * The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.
 * <p>
 * It is guaranteed that the answer will in the range of a 32-bit signed integer.
 */

public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 1;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        nodeQueue.offer(root);
        indexQueue.offer(1);

        while (!nodeQueue.isEmpty()) {
            int levelSize = nodeQueue.size();
            int leftIndex = 0, rightIndex = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = nodeQueue.poll();
                int index = indexQueue.poll();

                if (i == 0) {
                    leftIndex = index;
                }
                if (i == levelSize - 1) {
                    rightIndex = index;
                }

                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    indexQueue.offer(index * 2);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    indexQueue.offer(index * 2 + 1);
                }
            }

            maxWidth = Math.max(maxWidth, rightIndex - leftIndex + 1);
        }

        return maxWidth;
    }
}
