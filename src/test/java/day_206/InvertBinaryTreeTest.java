package day_206;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvertBinaryTreeTest {

    @Test
    void shouldReturnInvertedTree() {

        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode expected = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1)));

        MatcherAssert.assertThat(new InvertBinaryTree().invertTree(root),
                samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnInvertedTreeWithShotrerInput() {

        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        TreeNode expected = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(1));

        MatcherAssert.assertThat(new InvertBinaryTree().invertTree(root),
                samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnEmptyTreeWithEmptyInput() {
        TreeNode root = null;
        assertNull(new InvertBinaryTree().invertTree(root));
    }

}