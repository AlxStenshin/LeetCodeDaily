package day_328;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiusSubarrayAveragesTest {

    @Test
    void shouldReturnCorrectValues() {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] expected = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        assertArrayEquals(expected, new RadiusSubarrayAverages().getAverages(nums, k));
    }

    @Test
    void shouldAlsoReturnCorrectValues() {
        int[] nums = {100000};
        int k = 0;
        int[] expected = {100000};
        assertArrayEquals(expected, new RadiusSubarrayAverages().getAverages(nums, k));
    }

}