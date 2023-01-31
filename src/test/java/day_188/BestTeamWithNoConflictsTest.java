package day_188;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTeamWithNoConflictsTest {

    @Test
    void shouldReturn_34() {
        int[] scores = {1, 3, 5, 10, 15};
        int[] ages = {1, 2, 3, 4, 5};

        assertEquals(34, new BestTeamWithNoConflicts().bestTeamScore(scores, ages));
    }

    @Test
    void shouldReturn_16() {
        int[] scores = {4, 5, 6, 5};
        int[] ages = {2, 1, 2, 1};

        assertEquals(16, new BestTeamWithNoConflicts().bestTeamScore(scores, ages));
    }

    @Test
    void shouldReturn_6() {
        int[] scores = {1, 2, 3, 5};
        int[] ages = {8, 9, 10, 1};

        assertEquals(6, new BestTeamWithNoConflicts().bestTeamScore(scores, ages));
    }

}