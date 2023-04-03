package day_250;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsToSavePeopleTest {

    @Test
    void shouldReturnOne() {
        int[] people = {1, 2};
        int limit = 3;
        int expected = 1;

        assertEquals(expected, new BoatsToSavePeople().numRescueBoats(people, limit));
    }

    @Test
    void shouldReturnThree() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int expected = 3;

        assertEquals(expected, new BoatsToSavePeople().numRescueBoats(people, limit));
    }

    @Test
    void shouldReturnFour() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int expected = 4;

        assertEquals(expected, new BoatsToSavePeople().numRescueBoats(people, limit));
    }

}