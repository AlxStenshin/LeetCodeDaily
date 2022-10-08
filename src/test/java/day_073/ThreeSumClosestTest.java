package day_073;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new ThreeSumClosest().threeSumClosest(new int[]{0, 0, 0}, 1));
    }

}