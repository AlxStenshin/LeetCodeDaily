package day_260;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {

    @Test
    void shouldReturnTrue() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        assertTrue(new ValidateStackSequences().validateStackSequences(pushed, popped));
    }

    @Test
    void shouldReturnFalse() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};

        assertFalse(new ValidateStackSequences().validateStackSequences(pushed, popped));
    }

}