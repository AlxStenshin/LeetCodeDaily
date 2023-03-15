package day_231;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CheckCompletenessOfABinaryTreeTest {

    @Test
    void shouldReturnTrue() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));

        assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(node));
    }

    @Test
    void shouldReturnFalse() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(7)));

        assertFalse(new CheckCompletenessOfABinaryTree().isCompleteTree(node));
    }

}