package day_198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsFarFromLandAsPossibleTest {

    @Test
    void shouldReturnTwo() {
        int[][] grid = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}};

        assertEquals(2, new AsFarFromLandAsPossible().maxDistance(grid));
    }

    @Test
    void shouldReturnFour() {
        int[][] grid = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        assertEquals(4, new AsFarFromLandAsPossible().maxDistance(grid));
    }

}