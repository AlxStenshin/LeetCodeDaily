package day_09;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class FloodFillTest {

    @Test
    void shouldReturnCorrectValues() {
        int[][] actual = new FloodFill().floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        assertThat(actual, samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnEmptyValue() {
        int[][] actual = new FloodFill().floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0);
        int[][] expected = new int[][]{{0, 0, 0}, {0, 0, 0}};

        assertThat(actual, samePropertyValuesAs(expected));
    }

}