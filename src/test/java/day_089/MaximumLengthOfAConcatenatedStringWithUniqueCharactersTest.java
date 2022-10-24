package day_089;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {

    @Test
    void shouldReturnFour() {
        assertEquals(4, new MaximumLengthOfAConcatenatedStringWithUniqueCharacters().maxLength(List.of("un", "iq", "ue")));
    }

    @Test
    void shouldReturnSix() {
        assertEquals(6, new MaximumLengthOfAConcatenatedStringWithUniqueCharacters().maxLength(List.of("cha", "r", "act", "ers")));
    }

    @Test
    void shouldReturnTwentySix() {
        assertEquals(26, new MaximumLengthOfAConcatenatedStringWithUniqueCharacters().maxLength(List.of("abcdefghijklmnopqrstuvwxyz")));
    }
}