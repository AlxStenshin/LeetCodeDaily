package day_049;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class PseudoPalindromicPathsInBinaryTreeTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new PseudoPalindromicPathsInBinaryTree().pseudoPalindromicPaths(
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(3), new TreeNode(1)),
                        new TreeNode(1, null, new TreeNode(1)))));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new PseudoPalindromicPathsInBinaryTree().pseudoPalindromicPaths(
                new TreeNode(2,
                        new TreeNode(1, new TreeNode(1), new TreeNode(3, null, new TreeNode(1))),
                        new TreeNode(1))));
    }
}