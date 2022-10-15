package day_080;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTwoTest {

    @Test
    void shouldReturnFour() {
        assertEquals(4, new StringCompressionTwo().getLengthOfOptimalCompression("aaabcccd", 2));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new StringCompressionTwo().getLengthOfOptimalCompression("aabbaa", 2));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new StringCompressionTwo().getLengthOfOptimalCompression("aaaaaaaaaaa", 0));
    }

}