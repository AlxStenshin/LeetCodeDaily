package day_211;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPOTest {

    @Test
    void shouldReturnFour() {
        int k = 2;
        int w = 0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,1};

        assertEquals(4, new IPO().findMaximizedCapital(k ,w, profits, capital));
    }
    @Test
    void shouldReturnSix() {
        int k = 3;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};

        assertEquals(6, new IPO().findMaximizedCapital(k, w, profits, capital));
    }
}