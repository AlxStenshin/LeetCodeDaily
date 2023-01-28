package day_185;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void shouldPerformCorrectBehavior() {
        SummaryRanges summaryRanges = new SummaryRanges();
        assertEquals(0, summaryRanges.getIntervals().length);

        summaryRanges.addNum(1);
        assertArrayEquals(new int[][]{{1, 1}}, summaryRanges.getIntervals());

        summaryRanges.addNum(3);
        assertArrayEquals(new int[][]{{1, 1}, {3, 3}}, summaryRanges.getIntervals());

        summaryRanges.addNum(7);
        assertArrayEquals(new int[][]{{1, 1}, {3, 3}, {7, 7}}, summaryRanges.getIntervals());

        summaryRanges.addNum(2);
        assertArrayEquals(new int[][]{{1, 3}, {7, 7}}, summaryRanges.getIntervals());

        summaryRanges.addNum(6);
        assertArrayEquals(new int[][]{{1, 3}, {6, 7}}, summaryRanges.getIntervals());

    }

}