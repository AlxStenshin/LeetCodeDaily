package day_365;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredictTheWinnerTest {

    @Test
    void shouldReturnTrue() {
        int[] nums = {1, 5, 233, 7};
        assertTrue(new PredictTheWinner().PredictTheWinner(nums));
    }

    @Test
    void shouldReturnFalse() {
        int[] nums = {1, 5, 2};
        assertFalse(new PredictTheWinner().PredictTheWinner(nums));
    }
}