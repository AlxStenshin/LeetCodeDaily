package day_230;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/sum-root-to-leaf-numbers/">
 * 129. Sum Root to Leaf Numbers </a>
 * <p>
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * <p>
 * Each root-to-leaf path in the tree represents a number.
 * <p>
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
 * <p>
 * A leaf node is a node with no children.
 */

public class SumRootToLeafNumbers {

    int result;
    public int setNumbersSimplified(TreeNode root) {
        result = 0;
        addCurrentLevel(root, 0);
        return result;
    }

    private void addCurrentLevel(TreeNode root, int num) {
        if (root.left == null && root.right == null) {
            num = num * 10 + root.val;
            result += num;
            return;
        }

        num = num * 10 + root.val;
        if (root.left != null) {
            addCurrentLevel(root.left, num);
        }

        if (root.right != null) {
            addCurrentLevel(root.right, num);
        }
    }


    List<List<Character>> leafs = new ArrayList<>();
    List<Character> currentLevel = new ArrayList<>();
    public int sumNumbers(TreeNode root) {

        buildCurrentLevel(currentLevel, root);

        return leafs.stream()
                .map(String::valueOf)
                .map(s -> s.replace(", ", ""))
                .map(s -> s.replace("[", ""))
                .map(s -> s.replace("]", ""))
                .map(Integer::valueOf)
                .reduce(Integer::sum).orElse(0);
    }

    void buildCurrentLevel(List<Character> previous, TreeNode node) {
        if (node == null)
            return;

        List<Character> newLevel = new ArrayList<>(previous);
        newLevel.add((char)(node.val + '0'));

        if (node.left == null && node.right == null) {
            leafs.add(newLevel);

        } else {
            buildCurrentLevel(newLevel, node.left);
            buildCurrentLevel(newLevel, node.right);
        }
    }
}
