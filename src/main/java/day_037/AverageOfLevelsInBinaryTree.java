package day_037;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/">637. Average of Levels in Binary Tree</a>
 * <p>
 * Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
 * Answers within 10-5 of the actual answer will be accepted.
 */
public class AverageOfLevelsInBinaryTree {
    List<Double> result = new ArrayList<>();
    List<Integer> count = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        countLevelSum(root, 0);

        for (int level = 0; level < result.size(); level++) {
            result.set(level, result.get(level) / count.get(level));
        }
        return result;
    }

    private void countLevelSum(TreeNode root, int level) {
        if (root == null)
            return;

        if (result.size() <= level) {
            result.add(0.00);
            count.add(0);
        }

        result.set(level, result.get(level) + root.val);
        count.set(level, count.get(level) + 1);

        countLevelSum(root.left, level + 1);
        countLevelSum(root.right, level + 1);
    }
}
