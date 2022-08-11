package day_015;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    void shouldReturnTrue() {
        // root = [2, 1, 3]
        assertTrue(new ValidateBinarySearchTree().isValidBST(
                new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    @Test
    void shouldReturnFalse() {
        // root = [5, 1, 4, null, null, 3, 6]
        assertFalse(new ValidateBinarySearchTree().isValidBST(
                new TreeNode(5,
                        new TreeNode(1, new TreeNode(0), new TreeNode(0)),
                        new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
    }
}