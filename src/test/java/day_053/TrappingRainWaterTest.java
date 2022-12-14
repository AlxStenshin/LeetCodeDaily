package day_053;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void shouldReturnSix() {
        int[] input = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, new TrappingRainWater().trap(input));
    }

    @Test
    void shouldReturnNine() {
        int[] input = new int[]{4, 2, 0, 3, 2, 5};
        assertEquals(9, new TrappingRainWater().trap(input));
    }
}