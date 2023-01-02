package day_159;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    @Test
    void shouldReturnTrueIfAllLettersAreCapital() {
        String word = "USA";
        assertTrue(new DetectCapital().detectCapitalUse(word));
    }

    @Test
    void shouldReturnTrueIfOnlyFirstLetterIsCapital() {
        String word = "Leetcode";
        assertTrue(new DetectCapital().detectCapitalUse(word));
    }

    @Test
    void shouldReturnFalseIfMiddleLetterIsCapital() {
        String word = "uZfa";
        assertFalse(new DetectCapital().detectCapitalUse(word));
    }
    
    @Test
    void shouldReturnFalseIfOneLetterIsNonCapital() {
        String word = "FlaG";
        assertFalse(new DetectCapital().detectCapitalUse(word));
    }

    @Test
    void shouldReturnTrueIfAllLettersIsNonCapital() {
        String word = "ggg";
        assertTrue(new DetectCapital().detectCapitalUse(word));
    }



}