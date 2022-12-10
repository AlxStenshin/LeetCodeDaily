package day_136;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfSplittedBinaryTreeTest {

    @Test
    void shouldReturn_110() {
        TreeNode input = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));
        assertEquals(110, new MaximumProductOfSplittedBinaryTree().maxProduct(input));
    }

    @Test
    void shouldReturn_90() {
        TreeNode input = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(3), new TreeNode(4, new TreeNode(5), new TreeNode(6))));
        assertEquals(90, new MaximumProductOfSplittedBinaryTree().maxProduct(input));
    }
}