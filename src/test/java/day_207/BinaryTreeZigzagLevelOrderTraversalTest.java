package day_207;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeZigzagLevelOrderTraversalTest {


    @Test
    void shouldReturnZigzagOrderedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15,7));

        assertEquals(expected, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
    }

    @Test
    void shouldReturnSingleNodeForSingleNodeInputTree() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
    }

    @Test
    void shouldReturnEmptyListForEmptyInput() {
        TreeNode root = null;
        List<List<Integer>> expected = List.of();
        assertEquals(expected, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
    }

}