package day_098;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new MinimumGeneticMutation().minMutationHashMaps(
                "AACCGGTT",
                "AACCGGTA",
                new String[]{"AACCGGTA"}));

        assertEquals(1, new MinimumGeneticMutation().minMutation(
                "AACCGGTT",
                "AACCGGTA",
                new String[]{"AACCGGTA"}));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new MinimumGeneticMutation().minMutationHashMaps(
                "AACCGGTT",
                "AAACGGTA",
                new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));

        assertEquals(2, new MinimumGeneticMutation().minMutation(
                "AACCGGTT",
                "AAACGGTA",
                new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new MinimumGeneticMutation().minMutationHashMaps(
                "AAAAACCC",
                "AACCCCCC",
                new String[]{"AAAACCCC","AAACCCCC","AACCCCCC"}));

        assertEquals(3, new MinimumGeneticMutation().minMutation(
                "AAAAACCC",
                "AACCCCCC",
                new String[]{"AAAACCCC","AAACCCCC","AACCCCCC"}));
    }

    @Test
    void shouldAlsoReturnOne() {
        assertEquals(1, new MinimumGeneticMutation().minMutationHashMaps(
                "AACCGGTT",
                "AACCGGTA",
                new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));

        assertEquals(1, new MinimumGeneticMutation().minMutation(
                "AACCGGTT",
                "AACCGGTA",
                new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));
    }

    @Test
    void shouldAlsoReturnThree() {
        assertEquals(3, new MinimumGeneticMutation().minMutationHashMaps(
                "AACCGGTT",
                "AACCGCAA",
                new String[]{"AACCGGTA","AACCGGAA","AACCGCAA"}));

        assertEquals(3, new MinimumGeneticMutation().minMutation(
                "AACCGGTT",
                "AACCGCAA",
                new String[]{"AACCGGTA","AACCGGAA","AACCGCAA"}));
    }

    @Test
    void shouldAlsoReturnMinusOne() {

        // HashMaps Solution do not suitable for same misplaced chars

        assertEquals(-1, new MinimumGeneticMutation().minMutation(
                "AACCTTGG",
                "AATTCCGG",
                new String[]{"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"}));
    }


    @Test
    void shouldReturnFour() {

        assertEquals(4, new MinimumGeneticMutation().minMutation(
                "AACCGGTT",
                "AAACGGTA",
                new String[]{"AACCGATT","AACCGATA","AAACGATA","AAACGGTA"}));
    }


}