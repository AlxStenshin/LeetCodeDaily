package day_245;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReducingDishesTest {

    @Test
    void shouldReturnFourteen() {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        int expected = 14;

        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }

    @Test
    void shouldReturnTwenty() {
        int[] satisfaction = {4, 3, 2};
        int expected = 20;

        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }

    @Test
    void shouldReturnZero() {
        int[] satisfaction = {-1, -4, -5};
        int expected = 0;

        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }

}