package day_332;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TallestBillboardTest {

    @Test
    void shouldReturnSix() {
        int[] rods = {1,2,3,6};
        int expected = 6;

        assertEquals(expected, new TallestBillboard().tallestBillboard(rods));
    }

    @Test
    void shouldReturnTen() {
        int[] rods = {1,2,3,4,5,6};
        int expected = 10;

        assertEquals(expected, new TallestBillboard().tallestBillboard(rods));
    }

    @Test
    void shouldReturnZero() {
        int[] rods = {1,2};
        int expected = 0;

        assertEquals(expected, new TallestBillboard().tallestBillboard(rods));
    }
}