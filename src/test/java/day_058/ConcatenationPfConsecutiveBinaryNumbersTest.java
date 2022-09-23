package day_058;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationPfConsecutiveBinaryNumbersTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new ConcatenationPfConsecutiveBinaryNumbers().concatenatedBinary(1));
    }

    @Test
    void shouldReturn_27() {
        assertEquals(27, new ConcatenationPfConsecutiveBinaryNumbers().concatenatedBinary(3));
    }

    @Test
    void shouldReturn_505379714() {
        assertEquals(505379714, new ConcatenationPfConsecutiveBinaryNumbers().concatenatedBinary(12));
    }

}