package day_031;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumOfRectangleTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new MaxSumOfRectangle().maxSumSubmatrix(new int[][]{{1,0,1},{0,-2,3}}, 2));
    }

    @Test
    void shouldReturnTTree() {
        assertEquals(3, new MaxSumOfRectangle().maxSumSubmatrix(new int[][]{{2,2,-1}}, 3));
    }

}