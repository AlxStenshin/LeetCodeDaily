package day_127;

import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfStringHalvesAreAlikeTest extends TimeSensitiveTest {


    public DetermineIfStringHalvesAreAlikeTest() {
        this.setMaxAllowedTime(10);
    }

    @Test
    void shouldReturnTrue() {
        assertTrue(new DetermineIfStringHalvesAreAlike().halvesAreAlike("book"));
    }

    @Test
    void shouldAlsoReturnTrue() {
        assertTrue(new DetermineIfStringHalvesAreAlike().halvesAreAlike("AbCdEfGh"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new DetermineIfStringHalvesAreAlike().halvesAreAlike("textbook"));
    }

    @Test
    void shouldReturnTrueUsingHashSet() {
        assertTrue(new DetermineIfStringHalvesAreAlike().halvesAreAlikeHashSet("book"));
    }

    @Test
    void shouldAlsoReturnTrueUsingHashSet() {
        assertTrue(new DetermineIfStringHalvesAreAlike().halvesAreAlikeHashSet("AbCdEfGh"));
    }

    @Test
    void shouldReturnFalseUsingHashSet() {
        assertFalse(new DetermineIfStringHalvesAreAlike().halvesAreAlikeHashSet("textbook"));
    }

}