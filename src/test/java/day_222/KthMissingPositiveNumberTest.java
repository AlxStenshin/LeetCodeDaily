package day_222;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthMissingPositiveNumberTest {

    @Test
    void shouldReturnNine() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        assertEquals(9, new KthMissingPositiveNumber().findKthPositive_BinarySearch(arr, k));
    }

    @Test
    void shouldReturnSix() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        assertEquals(6, new KthMissingPositiveNumber().findKthPositive_BinarySearch(arr, k));
    }

    @Test
    void shouldReturnNineOn() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        assertEquals(9, new KthMissingPositiveNumber().findKthPositiveOn(arr, k));
    }

    @Test
    void shouldReturnSixOn() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        assertEquals(6, new KthMissingPositiveNumber().findKthPositiveOn(arr, k));
    }

}