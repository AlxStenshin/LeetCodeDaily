package day_360;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPossibleFullBinaryTreesTest {

    @Test
    void shouldReturnListOfZeros() {
        List<TreeNode> expected = List.of(new TreeNode(0, new TreeNode(0), new TreeNode(0)));
        assertEquals(expected, new AllPossibleFullBinaryTrees().allPossibleFBT(3));
    }

}