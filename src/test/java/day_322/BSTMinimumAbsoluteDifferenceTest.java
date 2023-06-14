package day_322;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BSTMinimumAbsoluteDifferenceTest {

    @Test
    void shouldReturnOne() {
        TreeNode node = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(6)),
                new TreeNode(6));
        assertEquals(1, new BSTMinimumAbsoluteDifference().getMinimumDifference(node));
    }

    @Test
    void shouldAlsoReturnOne() {
        TreeNode node = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, new TreeNode(12), new TreeNode(49)));
        assertEquals(1, new BSTMinimumAbsoluteDifference().getMinimumDifference(node));
    }
}