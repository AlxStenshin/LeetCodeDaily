package day_021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseCodeWordsTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2,
                new UniqueMorseCodeWords().uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1,
                new UniqueMorseCodeWords().uniqueMorseRepresentations(new String[] {"a"}));
    }

}