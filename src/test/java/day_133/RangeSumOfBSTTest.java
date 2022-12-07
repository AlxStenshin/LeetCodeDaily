package day_133;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumOfBSTTest {

    @Test
    void shouldReturn32() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        assertEquals(32, new RangeSumOfBST().rangeSumBST(input, 7, 15));
    }

    @Test
    void shouldReturn23() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        assertEquals(23, new RangeSumOfBST().rangeSumBST(input, 6, 10));
    }

    @Test
    void shouldReturn32SimplifiedSolution() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        assertEquals(32, new RangeSumOfBST().rangeSumBSTSimplified(input, 7, 15));
    }

    @Test
    void shouldReturn23SimplifiedSolution() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        assertEquals(23, new RangeSumOfBST().rangeSumBSTSimplified(input, 6, 10));
    }

    @Test
    void shouldReturn32OptimizedSolution() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        assertEquals(32, new RangeSumOfBST().rangeSumBSTOptimized(input, 7, 15));
    }

    @Test
    void shouldReturn23Optimizedolution() {
        TreeNode input = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        assertEquals(23, new RangeSumOfBST().rangeSumBSTOptimized(input, 6, 10));
    }

}