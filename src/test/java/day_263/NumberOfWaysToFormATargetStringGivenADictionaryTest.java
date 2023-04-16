package day_263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToFormATargetStringGivenADictionaryTest {

    @Test
    void shouldReturnSix() {
        String[] words = {"acca", "bbbb", "caca"};
        String target = "aba";
        assertEquals(6, new NumberOfWaysToFormATargetStringGivenADictionary().numWays(words, target));
    }

    @Test
    void shouldReturnFour() {
        String[] words = {"abba", "baab"};
        String target = "bab";
        assertEquals(4, new NumberOfWaysToFormATargetStringGivenADictionary().numWays(words, target));
    }

}