package day_08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfBSTTest {

    @Test
    void shouldReturnValidValue() {

        // Input: root = [6,2,8,0,4,7,9,null,null,3,5]
        TreeNode someTree = new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));

        // p = 2, q = 8
        // Output: 6
        assertEquals(6, new LowestCommonAncestorOfBST().lowestCommonAncestor(
                someTree,
                new TreeNode(2),
                new TreeNode(8)
        ).val);

        // p = 2, q = 4
        // Output: 2
        assertEquals(2, new LowestCommonAncestorOfBST().lowestCommonAncestor(
                someTree,
                new TreeNode(2),
                new TreeNode(4)
        ).val);
    }
}