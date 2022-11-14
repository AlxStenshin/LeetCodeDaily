package day_110;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostStonesRemovedWithSameRowOrColumnTest {

    @Test
    void shouldReturnFive() {
        //   | 0 | 1 | 2 |
        // 0 | x | x |   |
        // 1 | x |   | x |
        // 2 |   | x | x |

        int[][] input = new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        assertEquals(5, new MostStonesRemovedWithSameRowOrColumn().removeStones(input));
    }

    @Test
    void shouldReturnThree() {
        //   | 0 | 1 | 2 |
        // 0 | x |   | x |
        // 1 |   | x |   |
        // 2 | x |   | x |

        int[][] input = new int[][]{{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        assertEquals(3, new MostStonesRemovedWithSameRowOrColumn().removeStones(input));
    }

    @Test
    void shouldReturnZero() {
        int[][] input = new int[][]{{0, 0}};
        assertEquals(0, new MostStonesRemovedWithSameRowOrColumn().removeStones(input));
    }

}