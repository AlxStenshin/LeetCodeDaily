package day_205;

import utils.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/maximum-depth-of-binary-tree/" >
 * 104. Maximum Depth of Binary Tree </a>
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

public class MinimumDistanceBetweenBSTNodes {

    public int minDiffInBSTInorder(TreeNode root)
    {
        inorder(root);
        return ans;
    }

    private int ans = Integer.MAX_VALUE;
    private Integer prev = null;

    private void inorder(TreeNode root)
    {
        if (root == null)
            return;

        inorder(root.left);
        if (prev != null)
            ans = Math.min(ans, root.val - prev);
        prev = root.val;
        inorder(root.right);
    }


    Set<Integer> values = new HashSet<>();
    public int minDiffInBST(TreeNode root) {
        addNodeValue(root);

        Integer[] valuesArray = values.toArray(new Integer[0]);
        Set<Integer> diffs = new HashSet<>();
        for (int i = 1; i < valuesArray.length; i++) {
            for (int j = 0; j < i; j++) {
                var diff = Math.abs(valuesArray[i] - valuesArray[j]);
                if (diff != 0)
                    diffs.add(diff);
            }
        }

        return diffs.stream().sorted().collect(Collectors.toList()).get(0);
    }

    void addNodeValue(TreeNode root) {
        if (root != null) {
            values.add(root.val);

            addNodeValue(root.left);
            addNodeValue(root.right);
        }
    }
}
