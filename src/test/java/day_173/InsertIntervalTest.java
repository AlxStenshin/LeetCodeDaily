package day_173;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    void shouldMergeWithFirstInterval() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};

        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

    @Test
    void shouldMergeWithSecondThirdAndFourthInterval() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};

        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

}