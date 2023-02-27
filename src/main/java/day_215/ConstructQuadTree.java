package day_215;

import utils.tree.QuadTreeNode;

/**
 * <a href = "https://leetcode.com/problems/construct-quad-tree/">
 * 427. Construct Quad Tree </a>
 * <p>
 * Given a n * n matrix grid of 0's and 1's only. We want to represent the grid with a Quad-Tree.
 * <p>
 * Return the root of the Quad-Tree representing the grid.
 */
public class ConstructQuadTree {

    public QuadTreeNode construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }

    QuadTreeNode construct(int[][] grid, int x1, int y1, int length) {
        if (isLeaf(grid, x1, y1, length)) {
            return new QuadTreeNode(grid[x1][y1] == 1, true);
        } else {
            QuadTreeNode node = new QuadTreeNode(true, false);

            node.topLeft = construct(grid, x1, y1, length / 2);
            node.topRight = construct(grid, x1, y1 + length / 2, length / 2);
            node.bottomLeft = construct(grid, x1 + length / 2, y1, length / 2);
            node.bottomRight = construct(grid, x1 + length / 2, y1 + length / 2, length / 2);

            return node;
        }
    }

    boolean isLeaf(int[][] grid, int x1, int y1, int length) {
        for (int i = x1; i < x1 + length; i++) {
            for (int j = y1; j < y1 + length; j++) {
                if (grid[i][j] != grid[x1][y1])
                    return false;
            }
        }

        return true;
    }

}
