package day_362;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInAMountainArrayTest {

    @Test
    void shouldReturnOne() {
        int[] arr = {0, 1, 0};
        assertEquals(1, new PeakIndexInAMountainArray().peakIndexInMountainArray(arr));
    }

    @Test
    void shouldAlsoReturnOne() {
        int[] arr = {0, 2, 1, 0};
        assertEquals(1, new PeakIndexInAMountainArray().peakIndexInMountainArray(arr));
    }

    @Test
    void shouldReturnOneToo() {
        int[] arr = {0, 10, 5, 2};
        assertEquals(1, new PeakIndexInAMountainArray().peakIndexInMountainArray(arr));
    }
}