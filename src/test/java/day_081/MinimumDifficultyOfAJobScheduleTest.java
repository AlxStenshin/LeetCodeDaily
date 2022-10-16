package day_081;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDifficultyOfAJobScheduleTest {

    @Test
    void shouldReturnSeven() {
        assertEquals(7, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2));
    }

    @Test
    void shouldReturnMinusOne() {
        assertEquals(-1, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{9, 9, 9}, 4));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{1, 1, 1}, 3));
    }

}