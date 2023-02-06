package day_194;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void shouldReturn_2345417() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] expected = {2,3,5,4,1,7};

        assertArrayEquals(expected, new ShuffleTheArray().shuffle(nums, n));
    }

    @Test
    void shouldReturn_14233241() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] expected = {1,4,2,3,3,2,4,1};

        assertArrayEquals(expected, new ShuffleTheArray().shuffle(nums, n));
    }

    @Test
    void shouldReturn_1212() {
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] expected = {1, 2, 1, 2};

        assertArrayEquals(expected, new ShuffleTheArray().shuffle(nums, n));
    }

}