package day_232;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    void shouldReturnCorrectBinaryTree() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode expected = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(expected, new ConstructBinaryTreeFromInorderAndPostorderTraversal().buildTree(inorder, postorder));
    }

    @Test
    void shouldReturnSingleNodeTree() {
        int[] inorder = {-1};
        int[] postorder = {-1};
        TreeNode expected = new TreeNode(-1);

        assertEquals(expected, new ConstructBinaryTreeFromInorderAndPostorderTraversal().buildTree(inorder, postorder));
    }
}