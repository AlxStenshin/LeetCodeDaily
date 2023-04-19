package day_266;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LongestZigZagPathInABinaryTreeTest {

    @Test
    void shouldReturnThree() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(1,
                        new TreeNode(1),
                        new TreeNode(1,
                                new TreeNode(1,
                                        null,
                                        new TreeNode(1,
                                                null,
                                                new TreeNode(1))),
                                new TreeNode(1))));

        assertEquals(3, new LongestZigZagPathInABinaryTree().longestZigZag(root));
    }

    @Test
    void shouldReturnFour() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        null,
                        new TreeNode(1,
                                new TreeNode(1, null, new TreeNode(1)),
                                new TreeNode(1))),
                new TreeNode(1));

        assertEquals(4, new LongestZigZagPathInABinaryTree().longestZigZag(root));
    }

    @Test
    void shouldReturnZero() {
        TreeNode root = new TreeNode(1);
        assertEquals(0, new LongestZigZagPathInABinaryTree().longestZigZag(root));
    }

}