package day_103;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {

    @Test
    void shouldReturn_9969() {
        assertEquals(9969, new Maximum69Number().maximum69Number(9669));
    }

    @Test
    void shouldReturn_9999() {
        assertEquals(9999, new Maximum69Number().maximum69Number(9996));
    }
}