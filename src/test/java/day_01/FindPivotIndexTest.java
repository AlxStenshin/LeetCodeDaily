package day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    void shouldReturnThree() {
        assertEquals(3, new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new FindPivotIndex().pivotIndex(new int[]{2, 1, -1}));
    }

    @Test
    void shouldReturnMinusOne() {
        assertEquals(-1, new FindPivotIndex().pivotIndex(new int[]{1, 2, 3}));
    }



}