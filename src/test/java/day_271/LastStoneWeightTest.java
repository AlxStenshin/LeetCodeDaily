package day_271;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    @Test
    void shouldReturnOne() {
        int[] stones = {2,7,4,1,8,1};
        assertEquals(1, new LastStoneWeight().lastStoneWeight(stones));
    }

    @Test
    void shouldAlsoReturnOne() {
        int[] stones = {1};
        assertEquals(1, new LastStoneWeight().lastStoneWeight(stones));
    }

}