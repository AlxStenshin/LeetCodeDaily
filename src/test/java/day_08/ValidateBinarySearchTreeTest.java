package day_08;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new ValidateBinarySearchTree().isValidBST(new TreeNode(2,
                new TreeNode(1), new TreeNode(3))));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new ValidateBinarySearchTree().isValidBST(
                new TreeNode(5,
                    new TreeNode(1),
                    new TreeNode(4, new TreeNode(3), new TreeNode(6))
        )));
    }
}