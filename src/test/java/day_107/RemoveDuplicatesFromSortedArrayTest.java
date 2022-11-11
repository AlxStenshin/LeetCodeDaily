package day_107;

import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest extends TimeSensitiveTest {

    public RemoveDuplicatesFromSortedArrayTest() {
        this.setMaxAllowedTime(10);
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    void shouldReturnFive() {
        assertEquals(5, new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    void shouldReturnTwo_TwoPointers() {
        assertEquals(2, new RemoveDuplicatesFromSortedArray().removeDuplicatesTwoPointers(new int[]{1, 1, 2}));
    }

    @Test
    void shouldReturnFive_TwoPointers() {
        assertEquals(5, new RemoveDuplicatesFromSortedArray().removeDuplicatesTwoPointers(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}