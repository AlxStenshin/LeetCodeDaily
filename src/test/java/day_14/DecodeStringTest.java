package day_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void shouldMultiplySeparatedSequences() {
        assertEquals("aaabcbc", new DecodeString().decodeString("3[a]2[bc]"));
    }

    @Test
    void shouldMultiplyInnerSequences() {
        assertEquals("accaccacc", new DecodeString().decodeString("3[a2[c]]"));
    }

    @Test
    void shouldCorrectlyRecognizeTens() {
        assertEquals("aaaaaaaaaaa", new DecodeString().decodeString("11[a]"));
    }

}