package day_137;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    @Test
    void shouldReturnSix() {
        TreeNode input = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(6, new BinaryTreeMaximumPathSum().maxPathSum(input));
    }

    @Test
    void shouldReturnFortyTwo() {
        TreeNode input = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(42, new BinaryTreeMaximumPathSum().maxPathSum(input));
    }

}