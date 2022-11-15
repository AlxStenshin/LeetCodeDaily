package day_111;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/count-complete-tree-nodes/">
 * 222. Count Complete Tree Nodes </a>
 * <p>
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <p>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 * Design an algorithm that runs in less than O(n) time complexity.
 */

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int leftBranchHeight = getNodeDepth(root.left);
        int rightBranchHeight = getNodeDepth(root.right);

        if (leftBranchHeight == rightBranchHeight)
            return (1 << leftBranchHeight) + countNodes(root.right);
        else
            return (1 << rightBranchHeight) + countNodes(root.left);
    }

    int getNodeDepth(TreeNode root) {
        if (root == null)
            return 0;

        return getNodeDepth(root.left) + 1;
    }
}
