package day_043;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    @Test
    void shouldPerformCorrectInorderTraversal() {
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(List.of(1,3,2), new BinaryTreeInorderTraversal().inorderTraversalIterative(input));
        assertEquals(List.of(1,3,2), new BinaryTreeInorderTraversal().inorderTraversalRecursion(input));
    }

    @Test
    void shouldReturnSingleNodeWithSingleNodeInput() {
        TreeNode input = new TreeNode(1);
        assertEquals(List.of(1), new BinaryTreeInorderTraversal().inorderTraversalIterative(input));
        assertEquals(List.of(1), new BinaryTreeInorderTraversal().inorderTraversalRecursion(input));
    }

}