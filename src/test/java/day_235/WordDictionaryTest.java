package day_235;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordDictionaryTest {

    @Test
    void shouldPerformCorrectBehavior() {
        WordDictionary wordDictionary = new WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
    }

    @Test
    void shouldConsiderWordLength() {
        WordDictionary wordDictionary = new WordDictionary();

        wordDictionary.addWord("a");
        wordDictionary.addWord("a");
        assertTrue(wordDictionary.search("a"));
        assertFalse(wordDictionary.search("aa"));
        assertFalse(wordDictionary.search(".a"));
        assertFalse(wordDictionary.search("a."));
    }

}