package day_013;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreesWithFactorsTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new BinaryTreesWithFactors().numFactoredBinaryTrees(new int[]{1}));
    }

    @Test
    void shouldReturnThree() {
        // We can make these trees: [2], [4], [4, 2, 2]
        assertEquals(3, new BinaryTreesWithFactors().numFactoredBinaryTrees(new int[]{2, 4}));
    }

    @Test
    void shouldReturnSeven() {
        // We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
        assertEquals(7, new BinaryTreesWithFactors().numFactoredBinaryTrees(new int[]{2, 4, 5, 10}));
    }

}