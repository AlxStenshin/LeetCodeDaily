package day_204;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void shouldReturnThree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    void shouldReturnTwo() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));

        assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

}