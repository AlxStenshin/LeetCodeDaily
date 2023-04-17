package day_264;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void shouldReturnOneFalse() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);

        assertEquals(expected, new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));
    }

    @Test
    void shouldReturnFirstTrue() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = List.of(true, false, false, false, false);

        assertEquals(expected, new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));
    }

}