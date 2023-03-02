package day_218;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void shouldReturnSix() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, new StringCompression().compress(chars));
    }

    @Test
    void shouldReturnOne() {
        char[] chars = {'a'};
        assertEquals(1, new StringCompression().compress(chars));
    }

    @Test
    void shouldReturnFour() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, new StringCompression().compress(chars));
    }

}