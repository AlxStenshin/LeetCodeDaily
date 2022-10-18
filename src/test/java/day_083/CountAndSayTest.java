package day_083;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    @Test
    void shouldReturn_One() {
        assertEquals("1", new CountAndSay().countAndSay(1));
    }

    @Test
    void shouldReturn_OneTwoOneOne() {
        assertEquals("1211", new CountAndSay().countAndSay(4));
    }

}