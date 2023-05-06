package day_283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {
    @Test
    void shouldReturnFour() {
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4;

        assertEquals(expected, new NumberOfSubsequencesThatSatisfyTheGivenSumCondition().numSubseq(nums, target));
    }

    @Test
    void shouldReturnSix() {
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6;

        assertEquals(expected, new NumberOfSubsequencesThatSatisfyTheGivenSumCondition().numSubseq(nums, target));
    }

    @Test
    void shouldReturnSixtyOne() {
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61;

        assertEquals(expected, new NumberOfSubsequencesThatSatisfyTheGivenSumCondition().numSubseq(nums, target));
    }

}