package day_350;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindEventualSafeStatesTest {

    @Test
    void shouldReturnListOfTwoFourFiveSix() {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        assertEquals(List.of(2, 4, 5, 6), new FindEventualSafeStates().eventualSafeNodes(graph));
    }

    @Test
    void shouldReturnListOfFour() {
        int[][] graph = {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        assertEquals(List.of(4), new FindEventualSafeStates().eventualSafeNodes(graph));
    }
}