package day_311;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeNeededToInformAllEmployeesTest {

    @Test
    void shouldReturnZero() {
        int n = 1;
        int headId = 0;
        int[] manager = {-1};
        int[] informTime = {0};

        assertEquals(0, new TimeNeededToInformAllEmployees().numOfMinutes(n, headId, manager, informTime));
    }

    @Test
    void shouldReturnOne() {
        int n = 6;
        int headId = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};

        assertEquals(1, new TimeNeededToInformAllEmployees().numOfMinutes(n, headId, manager, informTime));
    }
}