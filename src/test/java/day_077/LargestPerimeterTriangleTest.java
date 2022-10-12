package day_077;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPerimeterTriangleTest {

    @Test
    void shouldReturnFive() {
        int[] input = new int[]{2,1,2};
        assertEquals(5, new LargestPerimeterTriangle().largestPerimeter(input));
        assertEquals(5, new LargestPerimeterTriangle().largestPerimeterArrays(input));
    }

    @Test
    void shouldReturnZero() {
        int[] input = new int[]{1,2,1};
        assertEquals(0, new LargestPerimeterTriangle().largestPerimeter(input));
        assertEquals(0, new LargestPerimeterTriangle().largestPerimeterArrays(input));
    }

    @Test
    void shouldReturnEight() {
        int[] input = new int[]{3, 6, 2, 3};
        assertEquals(8, new LargestPerimeterTriangle().largestPerimeter(input));
        assertEquals(8, new LargestPerimeterTriangle().largestPerimeterArrays(input));
    }
}