package day_246;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambleStringTest {

    @Test
    void shouldReturnTrue() {
       String s1 = "great";
       String s2 = "rgeat";

       assertTrue(new ScrambleString().isScramble(s1, s2));
    }

    @Test
    void shouldReturnFalse() {
       String s1 = "abcde";
       String s2 = "caebd";

       assertFalse(new ScrambleString().isScramble(s1, s2));
    }

    @Test
    void shouldReturnTrueWithSingleCharInput() {
       String s1 = "a";
       String s2 = "a";

       assertTrue(new ScrambleString().isScramble(s1, s2));
    }

}