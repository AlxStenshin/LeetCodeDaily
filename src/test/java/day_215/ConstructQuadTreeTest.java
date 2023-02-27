package day_215;

import org.junit.jupiter.api.Test;
import utils.tree.QuadTreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConstructQuadTreeTest {

    @Test
    void shouldReturnSingleNodeQuadTree() {
        int[][] grid = {{0, 1}, {1, 0}};
        QuadTreeNode expected = new QuadTreeNode(true, false,
                new QuadTreeNode(false, true),  // topLeft
                new QuadTreeNode(true, true),  // topRight
                new QuadTreeNode(true, true),  // botLeft
                new QuadTreeNode(false, true)); // botRight

        assertEquals(expected, new ConstructQuadTree().construct(grid));
    }


    @Test
    void shouldReturnTwoLeveledQuadTree() {
        int[][] grid = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };

        QuadTreeNode expected = new QuadTreeNode(true, false,
                new QuadTreeNode(true, true),            // topLeft
                new QuadTreeNode(true, false,             // topRight
                        new QuadTreeNode(false, true),         // topLeft
                        new QuadTreeNode(false, true),         // topRight
                        new QuadTreeNode(true, true),          // botLeft
                        new QuadTreeNode(true, true)),         // botRight
                new QuadTreeNode(true, true),            // botLeft
                new QuadTreeNode(false, true));           // botRight

        assertEquals(expected, new ConstructQuadTree().construct(grid));
    }

}