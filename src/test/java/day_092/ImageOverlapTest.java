package day_092;

import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import static org.junit.jupiter.api.Assertions.*;

class ImageOverlapTest extends TimeSensitiveTest {

    @Test
    void shouldReturnThree() {
        assertEquals(3, new ImageOverlap().largestOverlap(
                new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}},
                new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new ImageOverlap().largestOverlap(
                new int[][]{{1}},
                new int[][]{{1}}));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new ImageOverlap().largestOverlap(
                new int[][]{{0}},
                new int[][]{{0}}));
    }

}