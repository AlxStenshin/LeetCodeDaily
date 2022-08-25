package day_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnZeroOne() {
        assertArrayEquals(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9),
                new int[]{0, 1});
    }

    @Test
    void shouldReturnOneTwo() {
        assertArrayEquals(new TwoSum().twoSum(new int[]{3, 2, 4}, 6),
                new int[]{1, 2});
    }
}