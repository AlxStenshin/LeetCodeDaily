package day_037;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {

    List<Double> expected = List.of(3.00000,14.50000,11.00000);

    @Test
    void shouldReturnAverageForRightTree() {
        TreeNode input = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(expected, new AverageOfLevelsInBinaryTree().averageOfLevels(input));
    }

    @Test
    void shouldReturnAverageForLeftTree() {
        TreeNode input = new TreeNode(3, new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20));
        assertEquals(expected, new AverageOfLevelsInBinaryTree().averageOfLevels(input));
    }

}