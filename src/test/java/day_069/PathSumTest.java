package day_069;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    @Test
    void shouldReturnTrue() {
        TreeNode input = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        assertTrue(new PathSum().hasPathSum(input, 22));
        assertTrue(new PathSum().hasPathSumSimplified(input, 22));
    }

    @Test
    void shouldReturnFalse() {
        TreeNode input = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertFalse(new PathSum().hasPathSum(input, 5));
        assertFalse(new PathSum().hasPathSumSimplified(input, 5));

    }

    @Test
    void shouldReturnFalseWithEmptyInput() {
        TreeNode input = null;
        assertFalse(new PathSum().hasPathSum(input, 0));
        assertFalse(new PathSum().hasPathSumSimplified(input, 0));
    }

}