package day_074;

import utils.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href=https://leetcode.com/problems/two-sum-iv-input-is-a-bst/">
 *   653. Two Sum IV - Input is a BST</a>
 * <p>
 * Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
 */

public class TwoSumFour {
    Map<Integer, Integer> hm = new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (hm.containsKey(k - root.val)) {
            return true;
        }
        hm.put(root.val, 0);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
