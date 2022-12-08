package day_134;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {

    @Test
    void shouldReturnTrue() {
        TreeNode firstTree = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode secondTree = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        assertTrue(new LeafSimilarTrees().leafSimilar(firstTree, secondTree));
    }

    @Test
    void shouldReturnFalse() {
        TreeNode firstTree = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        TreeNode secondTree = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));

        assertFalse(new LeafSimilarTrees().leafSimilar(firstTree, secondTree));
    }

}