package day_076;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {

    @Test
    void shouldReturnTrueWithIncreasingArithmeticProgressionInput() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(input));
    }

    @Test
    void shouldReturnTrueWithDecreasingArithmeticProgressionInput() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        assertFalse(new IncreasingTripletSubsequence().increasingTriplet(input));
    }

    @Test
    void shouldReturnTrueWithSomeRandomIncreasingInput() {
        int[] input = new int[]{2, 1, 5, 0, 4, 6};
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(input));
    }

    @Test
    void shouldReturnTrueWithNonContinuousTrivialInput() {
        int[] input = new int[]{20, 100, 10, 12, 5, 13};
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(input));
    }

    @Test
    void shouldReturnTrue() {
        int[] input = new int[]{1, 2, 1, 3};
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(input));
    }

    @Test
    void shouldReturnFalse() {
        int[] input = new int[]{5, 1, 6};
        assertFalse(new IncreasingTripletSubsequence().increasingTriplet(input));
    }
}