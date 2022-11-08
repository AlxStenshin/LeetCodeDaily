package day_104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTheStringGreatTest {

    @Test
    void shouldReturn_leetcode() {
        assertEquals("leetcode", new MakeTheStringGreat().makeGood("leEeetcode"));
    }

    @Test
    void shouldReturnEmptyString() {
        assertEquals("", new MakeTheStringGreat().makeGood("abBAcC"));
    }

    @Test
    void shouldReturn_s() {
        assertEquals("s", new MakeTheStringGreat().makeGood("s"));
    }

}