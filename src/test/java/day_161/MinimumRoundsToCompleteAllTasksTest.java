package day_161;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRoundsToCompleteAllTasksTest {

    @Test
    void shouldReturnFour() {
        int[] tasks = new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        assertEquals(4, new MinimumRoundsToCompleteAllTasks().minimumRounds(tasks));
    }


    @Test
    void shouldReturnMinusOne() {
        int[] tasks = new int[]{2, 3, 3};
        assertEquals(-1, new MinimumRoundsToCompleteAllTasks().minimumRounds(tasks));
    }

    @Test
    void shouldReturnTwo() {
        int[] tasks = new int[]{5, 5, 5, 5};
        assertEquals(2, new MinimumRoundsToCompleteAllTasks().minimumRounds(tasks));
    }
    
}