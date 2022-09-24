package day_059;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathSumIITest {

    @Test
    void shouldReturnTwoPaths() {
        TreeNode input = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        List<List<Integer>> expected = List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
        assertEquals(expected, new PathSumII().pathSum(input, 22));
    }

    @Test
    void shouldReturnEmptyListWithUnreachableTarget() {
        TreeNode input = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<List<Integer>> expected = List.of();
        assertEquals(expected, new PathSumII().pathSum(input, 5));
    }

    @Test
    void shouldReturnEmptyListWithZeroTarget() {
        TreeNode input = new TreeNode(1, new TreeNode(2), null);
        List<List<Integer>> expected = List.of();
        assertEquals(expected, new PathSumII().pathSum(input, 0));
    }

}