package day_349;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;


import static org.junit.jupiter.api.Assertions.*;

class AllNodesSameDistanceInBinaryTreeTest {

    @Test
    void shouldReturnListOfSevenFourOne() {
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8)));
//        assertEquals(List.of(7, 4,1), new AllNodesSameDistanceInBinaryTree().distanceK(root, new TreeNode(5),2));
    }
}