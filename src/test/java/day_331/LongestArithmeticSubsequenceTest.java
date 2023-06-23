package day_331;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceTest {

    @Test
    void shouldReturnFour() {
        int[] nums = {3,6,9,12};
        int expected = 4;

        assertEquals(expected, new LongestArithmeticSubsequence().longestArithSeqLength(nums));
    }

    @Test
    void shouldReturnThree() {
        int[] nums = {9,4,7,2,10};
        int expected = 3;

        assertEquals(expected, new LongestArithmeticSubsequence().longestArithSeqLength(nums));
    }

    @Test
    void shouldReturnFourWithLongerInput() {
        int[] nums = {20,1,15,3,10,5,8};
        int expected = 4;

        assertEquals(expected, new LongestArithmeticSubsequence().longestArithSeqLength(nums));
    }

}