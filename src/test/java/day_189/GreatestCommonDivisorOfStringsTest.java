package day_189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @Test
    void shouldReturn_ABC() {
        String str1 = "ABCABC";
        String str2 = "ABC";

        assertEquals("ABC", new GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
    }

    @Test
    void shouldReturn_AB() {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        assertEquals("AB", new GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
    }

    @Test
    void shouldReturnEmptyString() {
        String str1 = "LEET";
        String str2 = "CODE";

        assertEquals("", new GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
    }

}