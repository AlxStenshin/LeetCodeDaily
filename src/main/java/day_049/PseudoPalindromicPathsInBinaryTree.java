package day_049;

import utils.tree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/">
 *     1457. Pseudo-Palindromic Paths in a Binary Tree</a>
 * <p>
 * Given a binary tree where node values are digits from 1 to 9.
 * A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node values
 * in the path is a palindrome.
 * <p>
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 */

public class PseudoPalindromicPathsInBinaryTree {
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq = new int[10];
        checkNode(root, freq);
        return count;
    }

    private void checkNode(TreeNode root, int[] freq) {
        if (root == null)
            return;

        if ((root.left == null) && (root.right == null)) {
            freq[root.val]++;
            if (isPseudoPalindrome(freq))
                count++;
            freq[root.val]--;
            return;
        }

        freq[root.val]++;
        checkNode(root.left, freq);
        checkNode(root.right, freq);
        freq[root.val]--;
    }

    private boolean isPseudoPalindrome(int[] frequency) {
        int odds = 0;
        for (int f : frequency) {
            if ((f & 1) == 1)
                odds++;
            if (odds > 1)
                return false;
        }
        return true;
    }

}
