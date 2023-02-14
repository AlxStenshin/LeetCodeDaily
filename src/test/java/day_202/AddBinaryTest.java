package day_202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void shouldReturn_100() {
        String a = "11";
        String b = "1";
        String expected = "100";

        assertEquals(expected, new AddBinary().addBinary(a, b));
    }

    @Test
    void shouldReturn_10101() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";

        assertEquals(expected, new AddBinary().addBinary(a, b));
    }

}