package day_046;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPerformanceOfATeamTest {

    @Test
    void shouldReturnSixty() {
        int[] speed = new int[]{2, 10, 3, 1, 5, 8};
        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};

        // We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4)
        // and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.
        assertEquals(60, new MaximumPerformanceOfATeam().maxPerformance(
                6, speed, efficiency, 2));
    }

    @Test
    void shouldReturnSixtyEight() {
        int[] speed = new int[]{2, 10, 3, 1, 5, 8};
        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};

        // This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5
        // to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.
        assertEquals(68, new MaximumPerformanceOfATeam().maxPerformance(
                6, speed, efficiency, 3));
    }

    @Test
    void shouldReturnSeventyTwo() {
        int[] speed = new int[]{2, 10, 3, 1, 5, 8};
        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};

        assertEquals(72, new MaximumPerformanceOfATeam().maxPerformance(
                6, speed, efficiency, 4));
    }

}