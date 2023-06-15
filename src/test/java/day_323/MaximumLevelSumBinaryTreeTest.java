package day_323;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLevelSumBinaryTreeTest {

    @Test
    void shouldReturnTwo() {
        TreeNode root = new TreeNode(1,
                new TreeNode(7, new TreeNode(7), new TreeNode(-8)),
                new TreeNode(0));

        assertEquals(2, new MaximumLevelSumBinaryTree().maxLevelSum(root));
    }
}