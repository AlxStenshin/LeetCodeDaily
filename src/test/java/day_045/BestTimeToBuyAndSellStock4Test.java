package day_045;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock4Test {

    @Test
    void shouldReturnTwo() {
        // Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
        assertEquals(2, new BestTimeToBuyAndSellStock4().maxProfit(2, new int[]{2, 4, 1}));
    }

    @Test
    void shouldReturnSeven() {
        // Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4.
        // Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
        assertEquals(7, new BestTimeToBuyAndSellStock4().maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }

}