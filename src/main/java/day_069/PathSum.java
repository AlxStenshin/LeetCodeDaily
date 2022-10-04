package day_069;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/path-sum/">
 *   112. Path Sum</a>
 * <p>
 *     Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Boolean> result = new ArrayList<>();
        int currentSum = 0;
        pathSum(root, targetSum, currentSum, result);

        return result.size() > 0;
    }

    void pathSum(TreeNode node, final int targetSum, int currentSum, List<Boolean> result) {
        if (node != null) {
            currentSum += node.val;

            if (node.left != null) {
                pathSum(node.left, targetSum, currentSum, result);
            }

            if (node.right != null) {
                pathSum(node.right, targetSum, currentSum, result);
            }

            if (node.left == null && node.right == null && targetSum == currentSum)
                result.add(true);
        }
    }

    public boolean hasPathSumSimplified(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && root.val == targetSum)
            return true;

        return hasPathSumSimplified(root.left, targetSum - root.val) ||
                hasPathSumSimplified(root.right, targetSum - root.val);
    }
}
