package day_216;

import utils.tree.TreeNode;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/find-duplicate-subtrees/">
 * 652. Find Duplicate Subtrees </a>
 * <p>
 * Given the root of a binary tree, return all duplicate subtrees.
 * <p>
 * For each kind of duplicate subtrees, you only need to return the root node of any one of them.
 * <p>
 * Two trees are duplicate if they have the same structure with the same node values.
 */

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<String, List<TreeNode>> map = new HashMap<>();
        addAsString(root, map);

        for (List<TreeNode> list : map.values()) {
            if (list.size() > 1) {
                res.add(list.get(0));
            }
        }
        return res;
    }

    private String addAsString(TreeNode root, Map<String, List<TreeNode>> map) {
        if (root == null) {
            return "";
        }

        String str = root.val + "," +
                addAsString(root.left, map) + "," +
                addAsString(root.right, map);
        map.computeIfAbsent(str, k -> new ArrayList<>()).add(root);
        return str;
    }

}
