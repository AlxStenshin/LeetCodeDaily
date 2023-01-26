package day_183;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsTest {

    @Test
    void shouldReturn_700() {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;

        assertEquals(700, new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k));
    }

    @Test
    void shouldReturn_200() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;

        assertEquals(200, new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k));
    }
    @Test

    void shouldReturn_500() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 0;

        assertEquals(500, new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k));
    }

}