package day_155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleThreadedCPUTest {

    @Test
    void shouldOrderTasksInGivenOrder_ZeroTwoThreeOne() {
        int[][] tasks = new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        int[] expected = new int[]{0, 2, 3, 1};

        assertArrayEquals(expected, new SingleThreadedCPU().getOrder(tasks));
    }
    @Test
    void shouldOrderTasksInGivenOrder_FourThreeTwoZeroOne() {
        int[][] tasks = new int[][]{{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}};
        int[] expected = new int[]{4, 3, 2, 0, 1};

        assertArrayEquals(expected, new SingleThreadedCPU().getOrder(tasks));
    }

}