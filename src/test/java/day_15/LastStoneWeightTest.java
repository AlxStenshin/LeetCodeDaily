package day_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new LastStoneWeight().lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

}