package day_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void shouldReturn_123() {
        int[] digits = {1, 2, 3};
        int[] output = {1, 2, 4};

        assertArrayEquals(output, new PlusOne().plusOne(digits));
    }

    @Test
    void shouldReturn_4322() {
        int[] digits = {4, 3, 2, 1};
        int[] output = {4, 3, 2, 2};

        assertArrayEquals(output, new PlusOne().plusOne(digits));
    }

    @Test
    void shouldReturn_10() {
        int[] digits = {9};
        int[] output = {1, 0};

        assertArrayEquals(output, new PlusOne().plusOne(digits));
    }

    @Test
    void shouldReturn_9000() {
        int[] digits = {8, 9, 9, 9};
        int[] output = {9, 0 , 0, 0};

        assertArrayEquals(output, new PlusOne().plusOne(digits));
    }

    @Test
    void shouldReturn_123_Shortened() {
        int[] digits = {1, 2, 3};
        int[] output = {1, 2, 4};

        assertArrayEquals(output, new PlusOne().plusOne_Shortened(digits));
    }

    @Test
    void shouldReturn_43223_Shortened() {
        int[] digits = {4, 3, 2, 1};
        int[] output = {4, 3, 2, 2};

        assertArrayEquals(output, new PlusOne().plusOne_Shortened(digits));
    }

    @Test
    void shouldReturn_103_Shortened() {
        int[] digits = {9};
        int[] output = {1, 0};

        assertArrayEquals(output, new PlusOne().plusOne_Shortened(digits));
    }

    @Test
    void shouldReturn_90003_Shortened() {
        int[] digits = {8, 9, 9, 9};
        int[] output = {9, 0 , 0, 0};

        assertArrayEquals(output, new PlusOne().plusOne_Shortened(digits));
    }

}