package day_166;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversalTest {

    @Test
    void shouldReturnListOfOneTwoThree() {
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(List.of(1,2,3), new BinaryTreePreorderTraversal().preorderTraversal(input));
    }

    @Test
    void shouldReturnEmptyList() {
        assertEquals(List.of(), new BinaryTreePreorderTraversal().preorderTraversal(null));
    }

    @Test
    void shouldReturnListOfOne() {
        TreeNode input = new TreeNode(1);
        assertEquals(List.of(1), new BinaryTreePreorderTraversal().preorderTraversal(input));
    }

}