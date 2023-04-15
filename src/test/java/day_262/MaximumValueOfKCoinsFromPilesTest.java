package day_262;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueOfKCoinsFromPilesTest {

    @Test
    void shouldReturn_101() {
        List<List<Integer>> piles = List.of(
                List.of(1, 100, 3),
                List.of(7, 8, 9));
        int k = 2;
        int expected = 101;

        assertEquals(expected, new MaximumValueOfKCoinsFromPiles().maxValueOfCoins(piles, k));
    }

    @Test
    void shouldReturn_706() {
        List<List<Integer>> piles = List.of(
                List.of(100),
                List.of(100),
                List.of(100),
                List.of(100),
                List.of(100),
                List.of(100),
                List.of(100),
                List.of(1, 1, 1, 1, 1, 1, 700));
        int k = 7;
        int expected = 706;

        assertEquals(expected, new MaximumValueOfKCoinsFromPiles().maxValueOfCoins(piles, k));
    }

}