package day_348;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthOfBinaryTreeTest {

    @Test
    void shouldReturnTwo() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(2, new MinimumDepthOfBinaryTree().minDepth(root));
    }
}