package day_074;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumFourTest {

    @Test
    void shouldReturnTrue() {
        TreeNode input = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));

        assertTrue(new TwoSumFour().findTarget(input, 9));
    }

    @Test
    void shouldReturnFalse() {
        TreeNode input = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));

        assertFalse(new TwoSumFour().findTarget(input, 28));
    }

}