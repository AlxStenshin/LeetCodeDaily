package day_055;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfRepeatedSubarrayTest {

    @Test
    void shouldReturnThree() {
        int[] input1 = new int[]{1, 2, 3, 2, 1};
        int[] input2 = new int[]{3, 2, 1, 4, 7};

        assertEquals(3, new MaximumLengthOfRepeatedSubarray().findLength(input1, input2));
    }

    @Test
    void shouldReturnFive() {
        int[] input1 = new int[]{0, 0, 0, 0, 0};
        int[] input2 = new int[]{0, 0, 0, 0, 0};

        assertEquals(5, new MaximumLengthOfRepeatedSubarray().findLength(input1, input2));
    }

}