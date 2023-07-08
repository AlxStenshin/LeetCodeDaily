package day_346;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PutMarblesInBagsTest {

    @Test
    void shouldReturnFour() {
        int[] weights = {1,3,5,1};
        int k = 2;
        assertEquals(4, new PutMarblesInBags().putMarbles(weights, k));
    }

    @Test
    void shouldReturnZero() {
        int[] weights = {1,3};
        int k = 2;
        assertEquals(0, new PutMarblesInBags().putMarbles(weights, k));
    }

}