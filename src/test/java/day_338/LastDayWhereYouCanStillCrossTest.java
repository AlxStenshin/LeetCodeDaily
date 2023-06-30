package day_338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDayWhereYouCanStillCrossTest {

    @Test
    void shouldReturnOne() {
        int row = 2;
        int col = 2;
        int[][] cells = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        assertEquals(1, new LastDayWhereYouCanStillCross().latestDayToCross(row, col, cells));
    }

    @Test
    void shouldReturnTwo() {
        int row = 2;
        int col = 2;
        int[][] cells = {{1, 1}, {2, 1}, {1, 2}, {2, 2}};
        assertEquals(2, new LastDayWhereYouCanStillCross().latestDayToCross(row, col, cells));
    }

    @Test
    void shouldReturnThree() {
        int row = 3;
        int col = 3;
        int[][] cells = {{1, 2}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2}, {3, 1}};
        assertEquals(3, new LastDayWhereYouCanStillCross().latestDayToCross(row, col, cells));
    }

}