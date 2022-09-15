package day_050;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOriginalArrayFromDoubledArrayTest {

    @Test
    void shouldReturnArrayOfOneThreeFour() {
        int[] input = new int[]{1, 3, 4, 2, 6, 8};
        int[] expected = new int[]{1, 3, 4};
        assertArrayEquals(expected, new FindOriginalArrayFromDoubledArray().findOriginalArray(input));
    }

    @Test
    void shouldReturnEmptyArray() {
        int[] input = new int[]{6, 3, 0, 1};
        int[] expected = new int[]{};
        assertArrayEquals(expected, new FindOriginalArrayFromDoubledArray().findOriginalArray(input));
    }

}