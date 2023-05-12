package day_289;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolvingQuestionsWithBrainpowerTest {
    @Test
    void shouldReturnFive() {
        int[][] questions = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};
        assertEquals(5, new SolvingQuestionsWithBrainpower().mostPoints(questions));
    }

    @Test
    void shouldReturnSeven() {
        int[][] questions = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        assertEquals(7, new SolvingQuestionsWithBrainpower().mostPoints(questions));
    }
}