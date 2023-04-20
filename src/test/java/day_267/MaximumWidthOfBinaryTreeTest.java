package day_267;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWidthOfBinaryTreeTest {

    @Test
    void shouldReturnFour() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        new TreeNode(3)),
                new TreeNode(2,
                        null,
                        new TreeNode(9)));

        assertEquals(4, new MaximumWidthOfBinaryTree().widthOfBinaryTree(root));
    }

    @Test
    void shouldReturnSeven() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5,
                                new TreeNode(6),
                                null),
                        null),
                new TreeNode(2,
                        null,
                        new TreeNode(9,
                                new TreeNode(7),
                                null)));

        assertEquals(7, new MaximumWidthOfBinaryTree().widthOfBinaryTree(root));
    }

    @Test
    void shouldReturnTwo() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null),
                new TreeNode(2));

        assertEquals(2, new MaximumWidthOfBinaryTree().widthOfBinaryTree(root));
    }

}