package day_06;

import utils.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal
 *https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 *
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */

public class NaryTreePreorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null)
            return list;

        list.add(root.val);
        System.out.println(root.val + " added");
        for (Node node : root.children)
            preorder(node);

        return list;
    }
}
