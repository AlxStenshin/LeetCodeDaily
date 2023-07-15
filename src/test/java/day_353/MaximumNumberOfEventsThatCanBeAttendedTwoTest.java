package day_353;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfEventsThatCanBeAttendedTwoTest {
    @Test
    void shouldReturnSeven() {
        int[][] events = {{1, 2, 4}, {3, 4, 3}, {2, 3, 1}};
        int k = 2;

        assertEquals(7, new MaximumNumberOfEventsThatCanBeAttendedTwo().maxValue(events, k));
    }

    @Test
    void shouldReturnTen() {
        int[][] events = {{1, 2, 4}, {3, 4, 3}, {2, 3, 10}};
        int k = 2;

        assertEquals(10, new MaximumNumberOfEventsThatCanBeAttendedTwo().maxValue(events, k));
    }

    @Test
    void shouldReturnNine() {
        int[][] events = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int k = 3;

        assertEquals(9, new MaximumNumberOfEventsThatCanBeAttendedTwo().maxValue(events, k));
    }
}