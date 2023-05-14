package day_291;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeScoreAfterNOperationsTest {

    @Test
    void shouldReturnOne() {
        int[] nums = {1, 2};
        assertEquals(1, new MaximizeScoreAfterNOperations().maxScore(nums));
    }

    @Test
    void shouldReturnEleven() {
        int[] nums = {3, 4, 6, 8};
        assertEquals(11, new MaximizeScoreAfterNOperations().maxScore(nums));
    }

    @Test
    void shouldReturnFourteen() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        assertEquals(14, new MaximizeScoreAfterNOperations().maxScore(nums));
    }

}