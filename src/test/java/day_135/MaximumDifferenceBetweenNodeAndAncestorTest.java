package day_135;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDifferenceBetweenNodeAndAncestorTest {

    @Test
    void shouldReturnSeven() {
        TreeNode input = new TreeNode(8,
                new TreeNode(3, new TreeNode(1), new TreeNode(6, new TreeNode(4), new TreeNode(7))),
                new TreeNode(10, null, new TreeNode(14, new TreeNode(13), null)));

        assertEquals(7, new MaximumDifferenceBetweenNodeAndAncestor().maxAncestorDiff(input));
    }

    @Test
    void shouldReturnThree() {
        TreeNode input = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(0, new TreeNode(3), null)));

        assertEquals(3, new MaximumDifferenceBetweenNodeAndAncestor().maxAncestorDiff(input));
    }

}