package day_023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayIntoConsecutiveSubsequencesTest {

    @Test
    void shouldReturnFalse() {
        assertFalse(new SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1, 2, 3, 4, 4, 5}));
    }

    @Test
    void shouldReturnTrue() {
        assertTrue(new SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1, 2, 3, 3, 4, 5}));
    }

    @Test
    void shouldReturnTrueWithBiggerInput() {
        assertTrue(new SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1, 2, 3, 3, 4, 4, 5, 5}));
    }
}