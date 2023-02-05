package day_193;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class FindAllAnagramsInAStringTest {

    @Test
    void shouldReturnZeroSix() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = List.of(0, 6);
        List<Integer> actual = new FindAllAnagramsInAString().findAnagrams(s, p);
        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnZeroOneTwo() {
        String s = "abab";
        String p = "ab";
        List<Integer> expected = List.of(0, 1, 2);
        List<Integer> actual = new FindAllAnagramsInAString().findAnagrams(s, p);
        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }

}