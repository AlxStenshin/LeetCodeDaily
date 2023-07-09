package day_347;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringWithLargestVarianceTest {

    @Test
    void shouldReturnThree() {
        String s  = "aababbb";
        assertEquals(3, new SubstringWithLargestVariance().largestVariance(s));
    }

    @Test
    void shouldReturnZero() {
        String s  = "abcde";
        assertEquals(0, new SubstringWithLargestVariance().largestVariance(s));
    }

}