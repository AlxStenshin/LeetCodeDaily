package day_229;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void shouldReturnTrue() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        assertTrue(new SymmetricTree().isSymmetric(root));
    }

    @Test
    void shouldReturnFalse() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));

        assertFalse(new SymmetricTree().isSymmetric(root));
    }

}