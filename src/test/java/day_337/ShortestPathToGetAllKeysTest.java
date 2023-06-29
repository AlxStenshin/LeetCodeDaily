package day_337;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathToGetAllKeysTest {

    @Test
    void shouldReturnEight() {
        String[] grid = {"@.a..","###.#","b.A.B"};
        assertEquals(8, new ShortestPathToGetAllKeys().shortestPathAllKeys(grid));
    }

    @Test
    void shouldReturnSix() {
        String[] grid = {"@..aA","..B#.","....b"};
        assertEquals(6, new ShortestPathToGetAllKeys().shortestPathAllKeys(grid));
    }

    @Test
    void shouldReturnMinusOne() {
        String[] grid = {"@Aa"};
        assertEquals(-1, new ShortestPathToGetAllKeys().shortestPathAllKeys(grid));
    }

}