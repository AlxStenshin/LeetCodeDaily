package day_017;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsWithConcatenationOfAllWordsTest {

    @Test
    void shouldReturnZeroNine() {
        assertEquals(List.of(0, 9), new SubstringsWithConcatenationOfAllWords()
                .findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}
                ));
    }

    @Test
    void shouldReturnNone() {
        assertEquals(List.of(), new SubstringsWithConcatenationOfAllWords()
                .findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}
                ));
    }

    @Test
    void shouldReturnEight() {
        assertEquals(List.of(8), new SubstringsWithConcatenationOfAllWords()
                .findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"}
                ));
    }

    @Test
    void shouldReturnSix_Nine_Twelve() {
        assertEquals(List.of(6, 9, 12), new SubstringsWithConcatenationOfAllWords()
                .findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}
                ));
    }
}