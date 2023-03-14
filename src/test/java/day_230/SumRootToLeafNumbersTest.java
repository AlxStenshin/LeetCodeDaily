package day_230;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {

    @Test
    void shouldReturn_25() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(25, new SumRootToLeafNumbers().sumNumbers(root));
    }

    @Test
    void shouldReturn_1026() {
        TreeNode root = new TreeNode(4,
                new TreeNode(9, new TreeNode(5), new TreeNode(1)),
                new TreeNode(0));
        assertEquals(1026, new SumRootToLeafNumbers().sumNumbers(root));
    }

    @Test
    void shouldReturn_25_Simplified() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(25, new SumRootToLeafNumbers().setNumbersSimplified(root));
    }

    @Test
    void shouldReturn_1026_Simplified() {
        TreeNode root = new TreeNode(4,
                new TreeNode(9, new TreeNode(5), new TreeNode(1)),
                new TreeNode(0));
        assertEquals(1026, new SumRootToLeafNumbers().setNumbersSimplified(root));
    }

}