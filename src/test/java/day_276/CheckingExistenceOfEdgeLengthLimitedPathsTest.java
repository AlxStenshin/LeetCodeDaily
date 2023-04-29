package day_276;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingExistenceOfEdgeLengthLimitedPathsTest {

    @Test
    void shouldReturnFalseTrue() {

        int n = 3;
        int[][] edgeList = {{0, 1, 2}, {1, 2, 4}, {2, 0, 8}, {1, 0, 16}};
        int[][] queries = {{0, 1, 2}, {0, 2, 5}};
        boolean[] expected = {false, true};

        assertArrayEquals(expected, new CheckingExistenceOfEdgeLengthLimitedPaths().distanceLimitedPathsExist(n, edgeList, queries));
    }

    @Test
    void shouldReturnTrueFalse() {
        int n = 5;
        int[][] edgeList = {{0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}};
        int[][] queries = {{0, 4, 14}, {1, 4, 13}};
        boolean[] expected = {true, false};

        assertArrayEquals(expected, new CheckingExistenceOfEdgeLengthLimitedPaths().distanceLimitedPathsExist(n, edgeList, queries));
    }

}