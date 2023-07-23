package day_360;

import utils.tree.TreeNode;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/all-possible-full-binary-trees/" >
 * 894. All Possible Full Binary Trees </a>
 * <p>
 * Given an integer n, return a list of all possible full binary trees with n nodes. Each node of each tree in the answer must have Node.val == 0.
 * <p>
 * Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.
 * <p>
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 */

public class AllPossibleFullBinaryTrees {
    Map<Integer, List<TreeNode>> saved = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0)
            return new ArrayList<>();

        if (!saved.containsKey(n)) {
            List<TreeNode> list = new ArrayList<>();

            if (n == 1)
                list.add(new TreeNode(0));
            else {
                for (int i = 1; i <= n - 1; i += 2) {
                    List<TreeNode> lTrees = allPossibleFBT(i);
                    List<TreeNode> rTrees = allPossibleFBT(n - i - 1);

                    for (TreeNode lt : lTrees) {
                        for (TreeNode rt : rTrees) {
                            list.add(new TreeNode(0, lt, rt));
                        }
                    }
                }
            }

            saved.put(n, list);
        }
        return saved.get(n);
    }
}
