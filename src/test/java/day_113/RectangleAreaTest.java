package day_113;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void shouldReturn_45() {
        int ax1 = -3;
        int ay1 = 0;
        int ax2 = 3;
        int ay2 = 4;
        int bx1 = 0;
        int by1 = -1;
        int bx2 = 9;
        int by2 = 2;

        assertEquals(45, new RectangleArea().computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }

    @Test
    void shouldReturn_16() {
        int ax1 = -2;
        int ay1 = -2;
        int ax2 = 2;
        int ay2 = 2;
        int bx1 = -2;
        int by1 = -2;
        int bx2 = 2;
        int by2 = 2;

        assertEquals(16, new RectangleArea().computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }

    @Test
    void shouldReturn_17() {
        int ax1 = -2;
        int ay1 = -2;
        int ax2 = 2;
        int ay2 = 2;
        int bx1 = 3;
        int by1 = 3;
        int bx2 = 4;
        int by2 = 4;

        assertEquals(17, new RectangleArea().computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));

    }
}