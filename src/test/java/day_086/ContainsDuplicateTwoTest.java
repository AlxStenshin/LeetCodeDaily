package day_086;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTwoTest {

    @Test
    void shouldReturnTrueWithIncreasingSequenceInput() {
        assertTrue(new ContainsDuplicateTwo().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(new ContainsDuplicateTwo().containsNearbyDuplicateTwoPointers(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void shouldReturnTrueWithSomeRepeatsInInput() {
        assertTrue(new ContainsDuplicateTwo().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertTrue(new ContainsDuplicateTwo().containsNearbyDuplicateTwoPointers(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new ContainsDuplicateTwo().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        assertFalse(new ContainsDuplicateTwo().containsNearbyDuplicateTwoPointers(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}