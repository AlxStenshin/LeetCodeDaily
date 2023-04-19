package day_266;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/">
 * 1372. Longest ZigZag Path in a Binary Tree </a>
 * <p>
 * You are given the root of a binary tree.
 * <p>
 * A ZigZag path for a binary tree is defined as follow:
 * <p>
 * Choose any node in the binary tree and a direction (right or left).<br>
 * If the current direction is right, move to the right child of the current node; otherwise, move to the left child.<br>
 * Change the direction from right to left or from left to right.<br>
 * Repeat the second and third steps until you can't move in the tree.<br>
 * Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).<br>
 * <p>
 * Return the longest ZigZag path contained in that tree.
 */

public class LongestZigZagPathInABinaryTree {

    int pathLength = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, false, 0);
        dfs(root, true, 0);
        return pathLength;
    }

    private void dfs(TreeNode node, boolean leftNodeNext, int currentLength) {
        if (node == null) {
            return;
        }

        pathLength = Math.max(pathLength, currentLength);
        if (leftNodeNext) {
            dfs(node.left, false, currentLength + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.left, false, 1);
            dfs(node.right, true, currentLength + 1);
        }
    }

}
