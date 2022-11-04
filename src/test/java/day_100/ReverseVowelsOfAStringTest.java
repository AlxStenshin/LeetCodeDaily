package day_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfAStringTest {

    @Test
    void shouldReturn_holle() {
        assertEquals("holle", new ReverseVowelsOfAString().reverseVowels("hello"));
    }

    @Test
    void shouldReturn_leotcede() {
        assertEquals("leotcede", new ReverseVowelsOfAString().reverseVowels("leetcode"));
    }
}