package day_109;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversWordsInAStringTest {

    @Test
    void shouldReturn_blue_is_sky_the() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void shouldReturn_world_hello() {
        String input = "  hello world  ";
        String expected = "world hello";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void shouldReturn_example_good_a() {
        String input = "a good   example";
        String expected = "example good a";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }
}