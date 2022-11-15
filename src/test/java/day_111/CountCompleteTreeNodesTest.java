package day_111;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CountCompleteTreeNodesTest {

    @Test
    void shouldReturnSix() {
        assertEquals(6, new CountCompleteTreeNodes().countNodes(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null))));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new CountCompleteTreeNodes().countNodes(null));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new CountCompleteTreeNodes().countNodes(new TreeNode(1)));
    }
}