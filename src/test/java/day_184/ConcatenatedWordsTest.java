package day_184;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class ConcatenatedWordsTest {

    @Test
    void shouldReturnThreeConcatenatedWords() {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> expected = List.of("catsdogcats", "dogcatsdog", "ratcatdogcat");

        List<String> actual = new ConcatenatedWords().findAllConcatenatedWordsInADict(words);

        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnOneWord() {
        String[] words = {"cat","dog","catdog"};
        List<String> expected = List.of("catdog");

        List<String> actual = new ConcatenatedWords().findAllConcatenatedWordsInADict(words);

        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }
}
