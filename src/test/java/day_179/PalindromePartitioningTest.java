package day_179;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class PalindromePartitioningTest {

    @Test
    void shouldReturnListOfTwoStrings() {
        String input = "aab";
        List<List<String>> expected = List.of(List.of("a", "a", "b"), List.of("aa", "b"));

        assertThat(new PalindromePartitioning().partition(input), Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnListOfOneString() {
        String input = "a";
        List<List<String>> expected = List.of(List.of("a"));

        assertThat(new PalindromePartitioning().partition(input), Matchers.containsInAnyOrder(expected.toArray()));
    }

}