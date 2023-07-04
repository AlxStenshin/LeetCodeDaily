package day_342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTwoTest {

    @Test
    void shouldReturnThree() {
        int[] nums = {2, 2, 3, 2};
        assertEquals(3, new SingleNumberTwo().singleNumber(nums));
    }

    @Test
    void shouldReturnNinetyNine() {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        assertEquals(99, new SingleNumberTwo().singleNumber(nums));
    }
}