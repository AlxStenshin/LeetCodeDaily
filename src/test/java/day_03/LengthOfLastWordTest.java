package day_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void shouldReturnFive_Split() {
        assertEquals(5, new LengthOfLastWord().lengthOfLastWordSplit("Hello World"));
    }

    @Test
    void shouldReturnFour_Split() {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWordSplit("   fly me   to   the moon  "));
    }

    @Test
    void shouldReturnSix_Split() {
        assertEquals(6, new LengthOfLastWord().lengthOfLastWordSplit("luffy is still joyboy"));
    }

    @Test
    void shouldReturnOne_Split() {
        assertEquals(1, new LengthOfLastWord().lengthOfLastWordSplit("a"));
    }

    @Test
    void shouldReturnFive() {
        assertEquals(5, new LengthOfLastWord().lengthOfLastWord("Hello World"));
    }

    @Test
    void shouldReturnFour() {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void shouldReturnSix() {
        assertEquals(6, new LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new LengthOfLastWord().lengthOfLastWord("a"));
    }
}