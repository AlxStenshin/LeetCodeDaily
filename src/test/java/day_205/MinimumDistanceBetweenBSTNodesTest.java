package day_205;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceBetweenBSTNodesTest {

    @Test
    void shouldReturnOneWithDiffBetweenOneAndTwo() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6));

        assertEquals(1, new MinimumDistanceBetweenBSTNodes().minDiffInBST(root));
    }

    @Test
    void shouldReturnOneWithDiffBetweenZeroAndOne() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, new TreeNode(12), new TreeNode(49)));

        assertEquals(1, new MinimumDistanceBetweenBSTNodes().minDiffInBST(root));
    }

    @Test
    void shouldReturnOneWithDiffBetweenOneAndTwoInorder() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6));

        assertEquals(1, new MinimumDistanceBetweenBSTNodes().minDiffInBSTInorder(root));
    }

    @Test
    void shouldReturnOneWithDiffBetweenZeroAndOneInorder() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, new TreeNode(12), new TreeNode(49)));

        assertEquals(1, new MinimumDistanceBetweenBSTNodes().minDiffInBSTInorder(root));
    }

}