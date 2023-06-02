package day_310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetonateTheMaximumBombsTest {
    @Test
    void shouldReturnTwo() {
        int[][] bombs = {{2, 1, 3}, {6, 1, 4}};
        assertEquals(2, new DetonateTheMaximumBombs().maximumDetonation(bombs));
    }

    @Test
    void shouldReturnOne() {
        int[][] bombs = {{1, 1, 5}, {10, 10, 4}};
        assertEquals(1, new DetonateTheMaximumBombs().maximumDetonation(bombs));
    }

    @Test
    void shouldReturnFive() {
        int[][] bombs = {{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}};
        assertEquals(5, new DetonateTheMaximumBombs().maximumDetonation(bombs));
    }
}