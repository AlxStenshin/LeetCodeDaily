package day_279;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignOfTheProductOfAnArrayTest {

    @Test
    void shouldReturnOne() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        assertEquals(1, new SignOfTheProductOfAnArray().arraySign(nums));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = {1, 5, 0, 2, -3};
        assertEquals(0, new SignOfTheProductOfAnArray().arraySign(nums));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] nums = {-1, 1, -1, 1, -1};
        assertEquals(-1, new SignOfTheProductOfAnArray().arraySign(nums));
    }

}