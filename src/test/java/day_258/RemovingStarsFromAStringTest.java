package day_258;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingStarsFromAStringTest {

    @Test
    void shouldReturn_lecoe() {
        String input = "leet**cod*e";
        String expected = "lecoe";

        assertEquals(expected, new RemovingStarsFromAString().removeStars(input));
    }

    @Test
    void shouldReturnEmptyString() {
        String input = "erase*****";
        String expected = "";

        assertEquals(expected, new RemovingStarsFromAString().removeStars(input));
    }

}