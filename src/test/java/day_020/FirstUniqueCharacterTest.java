package day_020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    void shouldReturnZero() {
        assertEquals(0, new FirstUniqueCharacter().firstUniqChar("leetcode"));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new FirstUniqueCharacter().firstUniqChar("loveleetcode"));
    }

    @Test
    void shouldReturnNone() {
        assertEquals(-1, new FirstUniqueCharacter().firstUniqChar("aabb"));
    }

}