package day_003;

import org.junit.jupiter.api.Test;

/**
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
 * Output: ["facebook","google","leetcode"]
 * Example 2:
 *
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
 * Output: ["apple","google","leetcode"]
 *
 */

class WordSubsetsTest {

    @Test
    void shouldReturnCorrectValues() {
        WordSubsets wordSubsets = new WordSubsets();

        System.out.println(wordSubsets.wordSubsets(
                new String[]{"amazon", "apple", "facebook", "google", "leetcode" },
                new String[]{"lo", "eo"}));
    }
}