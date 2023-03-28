package day_244;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostForTicketsTest {

    @Test
    void shouldReturnEleven() {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        int expected = 11;

        assertEquals(expected, new MinimumCostForTickets().mincostTickets(days, costs));
    }

    @Test
    void shouldReturnSeventeen() {
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        int[] costs = {2, 7, 15};
        int expected = 17;

        assertEquals(expected, new MinimumCostForTickets().mincostTickets(days, costs));
    }

}