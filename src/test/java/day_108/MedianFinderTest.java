package day_108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    @Test
    void shouldPerformCorrectBehavior() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5d, medianFinder.findMedian());
        medianFinder.addNum(3);
        assertEquals(2.0d, medianFinder.findMedian());
    }
}