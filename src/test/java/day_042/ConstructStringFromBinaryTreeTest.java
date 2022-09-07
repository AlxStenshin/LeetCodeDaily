package day_042;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConstructStringFromBinaryTreeTest {

    @Test
    void shouldCorrectlyOmitEmptyNodes() {
        TreeNode input = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertEquals("1(2(4))(3)", new ConstructStringFromBinaryTree().tree2str(input));
    }

    @Test
    void shouldKeepSeparatingParenthesis() {
        TreeNode input = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertEquals("1(2()(4))(3)", new ConstructStringFromBinaryTree().tree2str(input));
    }
}