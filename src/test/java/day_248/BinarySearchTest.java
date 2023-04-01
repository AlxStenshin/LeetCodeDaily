package day_248;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldReturnFour() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        assertEquals(4, new BinarySearch().search(nums, target));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        assertEquals(-1, new BinarySearch().search(nums, target));
    }

}