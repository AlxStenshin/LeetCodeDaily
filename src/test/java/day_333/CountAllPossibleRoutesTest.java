package day_333;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAllPossibleRoutesTest {
    @Test
    void shouldReturnFive() {
        int[] locations = {4, 3, 1};
        int start = 1;
        int finish = 0;
        int fuel = 6;

        assertEquals(5, new CountAllPossibleRoutes().countRoutes(locations, start, finish, fuel));
    }

    @Test
    void shouldReturnFour() {
        int[] locations = {2, 3, 6, 8, 4};
        int start = 1;
        int finish = 3;
        int fuel = 5;

        assertEquals(4, new CountAllPossibleRoutes().countRoutes(locations, start, finish, fuel));
    }

    @Test
    void shouldReturnZero() {
        int[] locations = {5, 2, 1};
        int start = 0;
        int finish = 2;
        int fuel = 3;

        assertEquals(0, new CountAllPossibleRoutes().countRoutes(locations, start, finish, fuel));
    }

}