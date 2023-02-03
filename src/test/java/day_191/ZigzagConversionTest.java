package day_191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    @Test
    void shouldReturn_PAHNAPLSIIGYIR() {
        String input = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";
        int numRows = 3;

        assertEquals(expected, new ZigzagConversion().convert(input, numRows));
    }

    @Test
    void shouldReturn_PINALSIGYAHRPI() {
        String input = "PAYPALISHIRING";
        String expected = "PINALSIGYAHRPI";
        int numRows = 4;

        assertEquals(expected, new ZigzagConversion().convert(input, numRows));
    }

    @Test
    void shouldReturn_A() {
        String input = "A";
        String expected = "A";
        int numRows = 1;

        assertEquals(expected, new ZigzagConversion().convert(input, numRows));
    }

}