package day_123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesSubsequenceTest {

    @Test
    void shouldReturnSeven() {
        int[] input = new int[]{2, 4, 6, 8, 10};
        assertEquals(7, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices(input));
        assertEquals(7, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices_DP(input));
    }

    @Test
    void shouldReturnSixty() {
        int[] input = new int[]{7, 7, 7, 7, 7};
        assertEquals(16, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices(input));
        assertEquals(16, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices_DP(input));
    }

    @Test
    void shouldReturn_8388331() {
        int[] input = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(8388331, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices(input));
        assertEquals(8388331, new ArithmeticSlicesSubsequence().numberOfArithmeticSlices_DP(input));
    }
}