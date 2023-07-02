package day_340;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfAchievableTransferRequestsTest {
    @Test
    void shouldReturnFive() {
        int n = 5;
        int[][] requests = {{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};

        assertEquals(5, new MaximumNumberOfAchievableTransferRequests().maximumRequests(n, requests));
    }

    @Test
    void shouldReturnThree() {
        int n = 3;
        int[][] requests = {{0,0},{1,2},{2,1}};

        assertEquals(3, new MaximumNumberOfAchievableTransferRequests().maximumRequests(n, requests));
    }

    @Test
    void shouldReturnFour() {
        int n = 4;
        int[][] requests = {{0,3},{3,1},{1,2},{2,0}};

        assertEquals(4, new MaximumNumberOfAchievableTransferRequests().maximumRequests(n, requests));
    }
}