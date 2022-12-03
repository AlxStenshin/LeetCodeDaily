package day_129;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFrequencyTest {

    @Test
    void shouldReturn_eert_WithInput_tree() {
        assertEquals("eert", new SortCharactersByFrequency().frequencySort("tree"));
    }

    @Test
    void shouldReturn_cccaaa_WithInput_aaaccc() {
        List<String> expectedResults = List.of("cccaaa", "aaaccc");
        assertTrue(expectedResults.stream().anyMatch(
                item -> item.equals(new SortCharactersByFrequency().frequencySort("aaaccc"))));
    }

    @Test
    void shouldReturn_bbAa_WithInput_Aabb() {
        assertEquals("bbAa", new SortCharactersByFrequency().frequencySort("Aabb"));
    }

    @Test
    void shouldReturn_eert_WithInput_tree_pq() {
        assertEquals("eert", new SortCharactersByFrequency().frequencySortPriorityQueue("tree"));
    }

    @Test
    void shouldReturn_cccaaa_WithInput_aaaccc_pq() {
        List<String> expectedResults = List.of("cccaaa", "aaaccc");
        assertTrue(expectedResults.stream().anyMatch(
                item -> item.equals(new SortCharactersByFrequency().frequencySortPriorityQueue("aaaccc"))));
    }

    @Test
    void shouldReturn_bbAa_WithInput_Aabb_pq() {
        assertEquals("bbAa", new SortCharactersByFrequency().frequencySortPriorityQueue("Aabb"));
    }
}