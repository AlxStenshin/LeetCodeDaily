package day_207;

import utils.tree.TreeNode;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">
 * 103. Binary Tree Zigzag Level Order Traversal </a>
 * <p>
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
 */

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> currentLevelNodes;
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            currentLevelNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                currentLevelNodes.add(temp.val);

                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            if (level % 2 != 0)
                Collections.reverse(currentLevelNodes);
            level++;
            result.add(currentLevelNodes);
        }
        return result;
    }

}
