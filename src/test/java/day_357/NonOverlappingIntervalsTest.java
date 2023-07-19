package day_357;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    @Test
    void shouldReturnOne() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
    }

    @Test
    void shouldReturnTwo() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
    }

    @Test
    void shouldReturnZero() {
        int[][] intervals = {{1, 2}, {2, 3}};
        assertEquals(0, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
    }

}