package day_068;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MinimumTimeToMakeRopeColorfulTest {

    @Test
    void shouldReturnThree() {
        assertEquals(3, new MinimumTimeToMakeRopeColorful().minCostGreedy("abaac", new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, new MinimumTimeToMakeRopeColorful().minCost("abaac", new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new MinimumTimeToMakeRopeColorful().minCostGreedy("abc", new int[]{1, 2, 3}));
        assertEquals(0, new MinimumTimeToMakeRopeColorful().minCost("abc", new int[]{1, 2, 3}));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new MinimumTimeToMakeRopeColorful().minCostGreedy("aabaa", new int[]{1, 2, 3, 4, 1}));
        assertEquals(2, new MinimumTimeToMakeRopeColorful().minCost("aabaa", new int[]{1, 2, 3, 4, 1}));
    }
}