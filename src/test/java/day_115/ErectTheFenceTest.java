package day_115;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ErectTheFenceTest {

    @Test
    void shouldReturnFivePointFence() {
        int[][] input = new int[][] {{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}};
        int[][] expected = new int[][] {{2, 0}, {4, 2}, {3, 3}, {1, 1}, {2, 4}} ;
        int[][] actual = new ErectTheFence().outerTrees_Jarvis(input);
        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));

    }

    @Test
    void shouldReturnThreePointFence() {
        int[][] input = new int[][]{{1, 2}, {2, 2}, {4, 2}};
        int[][] expected = new int[][]{{1, 2}, {2, 2}, {4, 2}};
        int[][] actual = new ErectTheFence().outerTrees_Jarvis(input);
        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));
   }

    @Test
    void shouldReturnFivePointFence_Monotone() {
        int[][] input = new int[][] {{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}};
        int[][] expected = new int[][] {{2, 0}, {4, 2}, {3, 3}, {1, 1}, {2, 4}} ;
        int[][] actual = new ErectTheFence().outerTrees_Monotone_Chain(input);
        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));
    }

    @Test
    void shouldReturnThreePointFence_Monotone() {
        int[][] input = new int[][]{{1, 2}, {2, 2}, {4, 2}};
        int[][] expected = new int[][]{{1, 2}, {2, 2}, {4, 2}};
        int[][] actual = new ErectTheFence().outerTrees_Monotone_Chain(input);
        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));
    }

}