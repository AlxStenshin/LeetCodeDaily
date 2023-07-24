package day_358;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    @Test
    void shouldReturnFiveTen() {
        int[] asteroids = {5, 10, -5};
        assertArrayEquals(new int[]{5, 10}, new AsteroidCollision().asteroidCollision(asteroids));
    }

    @Test
    void shouldReturnNone() {
        int[] asteroids = {8, -8};
        assertArrayEquals(new int[]{}, new AsteroidCollision().asteroidCollision(asteroids));
    }

    @Test
    void shouldReturnTen() {
        int[] asteroids = {10, 2, -5};
        assertArrayEquals(new int[]{10}, new AsteroidCollision().asteroidCollision(asteroids));
    }

}