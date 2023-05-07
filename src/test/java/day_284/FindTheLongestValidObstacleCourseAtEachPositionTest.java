package day_284;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLongestValidObstacleCourseAtEachPositionTest {

    @Test
    void shouldReturn_OneTwoThreeThree() {
        int[] obstacles = {1, 2, 3, 2};
        int[] expected = {1, 2, 3, 3};

        assertArrayEquals(expected, new FindTheLongestValidObstacleCourseAtEachPosition()
                .longestObstacleCourseAtEachPosition(obstacles));
    }

    @Test
    void shouldReturn_OneTwoOne() {
        int[] obstacles = {2, 2, 1};
        int[] expected = {1, 2, 1};

        assertArrayEquals(expected, new FindTheLongestValidObstacleCourseAtEachPosition()
                .longestObstacleCourseAtEachPosition(obstacles));
    }

    @Test
    void shouldReturn_OneOneTwoThreeTwoTwo() {
        int[] obstacles = {3, 1, 5, 6, 4, 2};
        int[] expected = {1, 1, 2, 3, 2, 2};

        assertArrayEquals(expected, new FindTheLongestValidObstacleCourseAtEachPosition()
                .longestObstacleCourseAtEachPosition(obstacles));
    }

}