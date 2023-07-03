package day_341;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyStringsTest {

    @Test
    void shouldReturnTrueWithMirroredInput() {
        String s = "ab";
        String goal = "ba";
        assertTrue(new BuddyStrings().buddyStrings(s, goal));
    }

    @Test
    void shouldReturnFalseWithTheSameInput() {
        String s = "ab";
        String goal = "ab";
        assertFalse(new BuddyStrings().buddyStrings(s, goal));
    }

    @Test
    void shouldReturnTrueWithTheSameAndMirroredInput() {
        String s = "aa";
        String goal = "aa";
        assertTrue(new BuddyStrings().buddyStrings(s, goal));
    }
}