package day_126;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {

    @Test
    void shouldReturnTrue() {
        int[] input = new int[]{1, 2, 2, 1, 1, 3};
        assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(input));
    }

    @Test
    void shouldAlsoReturnTrue() {
        int[] input = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(input));
    }

    @Test
    void shouldReturnFalse() {
        int[] input = new int[]{1, 2};
        assertFalse(new UniqueNumberOfOccurrences().uniqueOccurrences(input));
    }
}