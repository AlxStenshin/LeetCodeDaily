package day_318;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueAtAGivenIndexInABoundedArrayTest {

    @Test
    void shouldReturnTwo() {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        int expected = 2;

        assertEquals(expected, new MaximumValueAtAGivenIndexInABoundedArray().maxValue(n, index, maxSum));
    }
    @Test
    void shouldReturnThree() {
        int n = 6;
        int index = 1;
        int maxSum = 10;
        int expected = 3;

        assertEquals(expected, new MaximumValueAtAGivenIndexInABoundedArray().maxValue(n, index, maxSum));
    }
}