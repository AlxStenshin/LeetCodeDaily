package day_002;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
 *
 * Input: words = ["a","b","c"], pattern = "a"
 * Output: ["a","b","c"]
 *
 * 1 <= pattern.length <= 20
 * 1 <= words.length <= 50
 * words[i].length == pattern.length
 * pattern and words[i] are lowercase English letters.
 */

class FindAndReplacePatternTest {

    @Test
    void shouldReturnTwoValues() {
        List<String> answer = List.of("mee", "aqq");
        FindAndReplacePattern frp = new FindAndReplacePattern();
        assertEquals(answer, frp.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }

    @Test
    void shouldReturnThreeValues() {
        List<String> answer = List.of("a", "b", "c");
        FindAndReplacePattern frp = new FindAndReplacePattern();
        assertEquals(answer, frp.findAndReplacePattern(new String[]{"a", "b", "c",}, "a"));
    }
}