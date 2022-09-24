package day_059;


import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/path-sum-ii/">
 *     113. Path Sum II</a>
 * <p>
 * Given the root of a binary tree and an integer targetSum.
 * <p>
 * Return all root-to-leaf paths where the sum of the node values in the path equals targetSum.
 * <p>
 * Each path should be returned as a list of the node values, not node references.
 * <p>
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 */

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    void pathSum(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        // Last Leaf with target Sum
        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(path));
        } else {
            pathSum(root.left, targetSum - root.val, path, result);
            pathSum(root.right, targetSum - root.val, path, result);
        }

        path.remove(path.size() - 1);
    }
}
