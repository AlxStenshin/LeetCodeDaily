package day_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Input: m = 3, n = 2
 * Output: 3
 *
 * Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner: *
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 */

class UniquePathsTest {

    UniquePaths paths = new UniquePaths();

    @Test
    void shouldReturnThree() {
        assertEquals(3, paths.uniquePaths(3, 2));
    }

    @Test
    void shouldReturnTen() {
        assertEquals(10, paths.uniquePaths(3, 4));
    }
}