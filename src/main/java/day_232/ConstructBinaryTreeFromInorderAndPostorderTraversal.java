package day_232;

import utils.tree.TreeNode;

/**
 * <a href = "https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">
 * 106. Construct Binary Tree from Inorder and Postorder Traversal </a>
 * <p>
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 */

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createNode(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode createNode(int[] inorder, int inorderStart, int inorderEnd,
                                int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart > inorderEnd || postorderStart > postorderEnd) {
            return null;
        }

        int rootVal = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - inorderStart;
        int rightSize = inorderEnd - rootIndex;
        root.left = createNode(inorder, inorderStart, rootIndex - 1, postorder, postorderStart, postorderStart + leftSize - 1);
        root.right = createNode(inorder, rootIndex + 1, inorderEnd, postorder, postorderEnd - rightSize, postorderEnd - 1);

        return root;
    }
}
