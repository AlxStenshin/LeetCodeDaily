package day_062;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushDominoesTest {

    @Test
    void shouldReturnSameStringAsInput() {
        assertEquals("RR.L", new PushDominoes().pushDominoes("RR.L"));
    }

    @Test
    void shouldReturnCorrectValue() {
        assertEquals("LL.RR.LLRRLL..", new PushDominoes().pushDominoes(".L.R...LR..L.."));
    }
}