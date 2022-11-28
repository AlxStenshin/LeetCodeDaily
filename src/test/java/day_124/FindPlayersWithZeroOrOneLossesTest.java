package day_124;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class FindPlayersWithZeroOrOneLossesTest {

    @Test
    void shouldReturnThreeWinnersAndFourOneMatchLosers() {
        int[][] input = new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        int[][] expected = new int[][]{{1, 2, 10}, {4, 5, 7, 8}};
        List<List<Integer>> actual = new FindPlayersWithZeroOrOneLosses().findWinners(input);

        assertThat(actual.get(0)).hasSameElementsAs(Arrays.stream(expected[0]).boxed().collect(Collectors.toList()));
        assertThat(actual.get(1)).hasSameElementsAs(Arrays.stream(expected[1]).boxed().collect(Collectors.toList()));
    }

    @Test
    void shouldReturnFourWinnersAndNoneMatchLosers() {
        int[][] input = new int[][]{{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        int[][] expected = new int[][]{{1, 2, 5, 6}, {}};
        List<List<Integer>> actual = new FindPlayersWithZeroOrOneLosses().findWinners(input);

        assertThat(actual.get(0)).hasSameElementsAs(Arrays.stream(expected[0]).boxed().collect(Collectors.toList()));
        assertThat(actual.get(1)).hasSameElementsAs(Arrays.stream(expected[1]).boxed().collect(Collectors.toList()));
    }

}