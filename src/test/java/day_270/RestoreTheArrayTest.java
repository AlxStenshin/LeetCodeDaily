package day_270;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestoreTheArrayTest {

    @Test
    void shouldReturnOne() {
        String s = "1000";
        int k = 10000;
        int expected = 1;

        assertEquals(expected, new RestoreTheArray().numberOfArrays(s, k));
    }

    @Test
    void shouldReturnZero() {
        String s = "1000";
        int k = 10;
        int expected = 0;

        assertEquals(expected, new RestoreTheArray().numberOfArrays(s, k));
    }

    @Test
    void shouldReturnEight() {
        String s = "1317";
        int k = 2000;
        int expected = 8;

        assertEquals(expected, new RestoreTheArray().numberOfArrays(s, k));
    }

}