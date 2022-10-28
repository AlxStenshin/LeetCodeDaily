package day_093;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class GroupAnagramsTest extends TimeSensitiveTest {

    @Test
    void shouldReturnGroupedAnagrams() {
        List<List<String>> expected = List.of(List.of("bat"), List.of("tan", "nat"), List.of("eat", "tea", "ate"));
        List<List<String>> actual = new GroupAnagrams().groupAnagramsHashMaps(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnGroupedAnagrams_Arrays() {
        List<List<String>> expected = List.of(List.of("bat"), List.of("tan", "nat"), List.of("eat", "tea", "ate"));
        List<List<String>> actualArrays = new GroupAnagrams().groupAnagramsArrays(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertThat(actualArrays, Matchers.containsInAnyOrder(expected.toArray()));
    }


    @Test
    void shouldReturnEmptyLists() {
        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> actual = new GroupAnagrams().groupAnagramsHashMaps(new String[]{""});
        assertThat(expected, Matchers.containsInAnyOrder(actual.toArray()));
    }

    @Test
    void shouldReturnEmptyLists_Arrays() {
        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> actualArrays = new GroupAnagrams().groupAnagramsArrays(new String[]{""});
        assertThat(actualArrays, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnSingleElementList() {
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> actual = new GroupAnagrams().groupAnagramsHashMaps(new String[]{"a"});
        assertThat(expected, Matchers.containsInAnyOrder(actual.toArray()));
    }

    @Test
    void shouldReturnSingleElementList_Arrays() {
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> actualArrays = new GroupAnagrams().groupAnagramsArrays(new String[]{"a"});
        assertThat(actualArrays, Matchers.containsInAnyOrder(expected.toArray()));
    }
}