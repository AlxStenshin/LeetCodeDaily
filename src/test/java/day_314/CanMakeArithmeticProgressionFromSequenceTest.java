package day_314;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanMakeArithmeticProgressionFromSequenceTest {

    @Test
    void shouldReturnTrue() {
        int[] arr = {3, 5, 1};
        assertTrue(new CanMakeArithmeticProgressionFromSequence().canMakeArithmeticProgression(arr));
    }

    @Test
    void shouldReturnFalse() {
        int[] arr = {1, 2, 4};
        assertFalse(new CanMakeArithmeticProgressionFromSequence().canMakeArithmeticProgression(arr));
    }

}