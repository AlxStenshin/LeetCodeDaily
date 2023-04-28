package day_275;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarStringGroupsTest {

    @Test
    void shouldReturnTwo() {
        String[] strs = {"tars", "rats", "arts", "star"};
        assertEquals(2, new SimilarStringGroups().numSimilarGroups(strs));
    }

    @Test
    void shouldReturnOne() {
        String[] strs = {"omv", "ovm"};
        assertEquals(1, new SimilarStringGroups().numSimilarGroups(strs));
    }

}