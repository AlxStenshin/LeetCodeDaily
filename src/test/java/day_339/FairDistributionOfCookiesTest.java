package day_339;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairDistributionOfCookiesTest {

    @Test
    void shouldReturnThirtyOne() {
        int[] cookies = {8, 15, 10, 20, 8};
        int k = 2;

        assertEquals(31, new FairDistributionOfCookies().distributeCookies(cookies, k));
    }

    @Test
    void shouldReturnSeven() {
        int[] cookies = {6, 1, 3, 2, 2, 4, 1, 2};
        int k = 3;

        assertEquals(7, new FairDistributionOfCookies().distributeCookies(cookies, k));
    }
}