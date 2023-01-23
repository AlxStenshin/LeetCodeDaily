package day_180;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheTownJudgeTest {

    @Test
    void shouldReturnTwo() {
        int n = 2;
        int[][] trust = {{1, 2}};

        assertEquals(2, new FindTheTownJudge().findJudge(n, trust));
    }

    @Test
    void shouldReturnThree() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}};

        assertEquals(3, new FindTheTownJudge().findJudge(n, trust));
    }

    @Test
    void shouldReturnMinusOne() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

        assertEquals(-1, new FindTheTownJudge().findJudge(n, trust));
    }

    @Test
    void shouldReturnOneWithEmptyInput() {
        int n = 1;
        int[][] trust = {};

        assertEquals(1, new FindTheTownJudge().findJudge(n, trust));
    }

    @Test
    void shouldReturnTwo_Optimized() {
        int n = 2;
        int[][] trust = {{1, 2}};

        assertEquals(2, new FindTheTownJudge().findJudgeOptimized(n, trust));
    }

    @Test
    void shouldReturnThree_Optimized() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}};

        assertEquals(3, new FindTheTownJudge().findJudgeOptimized(n, trust));
    }

    @Test
    void shouldReturnMinusOne_Optimized() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

        assertEquals(-1, new FindTheTownJudge().findJudgeOptimized(n, trust));
    }

    @Test
    void shouldReturnOneWithEmptyInput_Optimized() {
        int n = 1;
        int[][] trust = {};

        assertEquals(1, new FindTheTownJudge().findJudgeOptimized(n, trust));
    }

}