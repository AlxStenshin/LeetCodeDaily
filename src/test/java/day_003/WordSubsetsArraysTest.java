package day_003;

import org.junit.jupiter.api.Test;

class WordSubsetsArraysTest {

    @Test
    void shouldReturnCorrectValues() {
        WordSubsetsArrays wordSubsets = new WordSubsetsArrays();

        System.out.println(wordSubsets.wordSubsets(
                new String[]{"amazon", "apple", "facebook", "google", "leetcode" },
                new String[]{"lo", "eo"}));
    }
}