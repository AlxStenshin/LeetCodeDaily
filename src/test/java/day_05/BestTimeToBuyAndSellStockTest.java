package day_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void shouldReturnFive() {
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit2D(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit2D(new int[]{7,6,4,3,1}));
        assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1}));
    }

}