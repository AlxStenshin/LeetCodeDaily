package day_036;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {


    @Test
    void shouldReturnOneForSingleNoteTree() {
        assertEquals(1, new CountGoodNodesInBinaryTree().goodNodes(new TreeNode(1)));
    }

    @Test
    void shouldReturnThreeForSimpleTree() {
        TreeNode source = new TreeNode(3,
                new TreeNode(3, new TreeNode(4), new TreeNode(2)),
                null);
        assertEquals(3, new CountGoodNodesInBinaryTree().goodNodes(source));
    }

    @Test
    void shouldReturnFourForComplexTree() {
        TreeNode source = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)
                ));
        assertEquals(4, new CountGoodNodesInBinaryTree().goodNodes(source));
    }

}