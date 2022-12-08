package day_134;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/leaf-similar-trees/description/">
 *  872. Leaf-Similar Trees </a>
 * <p>
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * <p>
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */

public class LeafSimilarTrees {

    List<Integer> firstTreeLeafs = new ArrayList<>();
    List<Integer> secondTreeLeafs = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        appendNodeLeaf(firstTreeLeafs, root1);
        appendNodeLeaf(secondTreeLeafs, root2);

        return firstTreeLeafs.equals(secondTreeLeafs);
    }

    void appendNodeLeaf(List<Integer> leafs, TreeNode node) {
        if (node.left == null && node.right == null) {
            leafs.add(node.val);
        }
        else {
            if (node.left != null)
                appendNodeLeaf(leafs, node.left);
            if (node.right != null)
                appendNodeLeaf(leafs, node.right);
        }
    }

}

