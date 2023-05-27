package day_304;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameThreeTest {

    @Test
    void shouldReturnBob() {
        int[] values = {1, 2, 3, 7};
        assertEquals("Bob", new StoneGameThree().stoneGameIII(values));
    }

    @Test
    void shouldReturnAlice() {
        int[] values = {1, 2, 3, -9};
        assertEquals("Alice", new StoneGameThree().stoneGameIII(values));
    }

    @Test
    void shouldReturnTie() {
        int[] values = {1, 2, 3, 6};
        assertEquals("Tie", new StoneGameThree().stoneGameIII(values));
    }

}