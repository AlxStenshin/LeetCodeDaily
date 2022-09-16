package day_051;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreFromPerformingMultiplicationOperationsTest {

    @Test
    void shouldReturnFourteen() {
        assertEquals(14, new MaximumScoreFromPerformingMultiplicationOperations()
                .maximumScore(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    }

    @Test
    void shouldReturnOneHundredAndTwo() {
        assertEquals(102, new MaximumScoreFromPerformingMultiplicationOperations()
                .maximumScore(new int[]{-5, -3, -3, -2, 7, 1}, new int[]{-10, -5, 3, 4, 6}));
    }

}