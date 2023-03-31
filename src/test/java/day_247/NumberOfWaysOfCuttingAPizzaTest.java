package day_247;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysOfCuttingAPizzaTest {

    @Test
    void shouldReturnThree() {
        String[] pizza = {"A..", "AAA", "..."};
        int k = 3;
        assertEquals(3, new NumberOfWaysOfCuttingAPizza().ways(pizza, k));
    }

    @Test
    void shouldReturnOne() {
        String[] pizza = {"A..","AA.","..."};
        int k = 3;
        assertEquals(1, new NumberOfWaysOfCuttingAPizza().ways(pizza, k));
    }

    @Test
    void shouldAlseReturnOne() {
        String[] pizza = {"A..","A..","..."};
        int k = 1;
        assertEquals(1, new NumberOfWaysOfCuttingAPizza().ways(pizza, k));
    }

}