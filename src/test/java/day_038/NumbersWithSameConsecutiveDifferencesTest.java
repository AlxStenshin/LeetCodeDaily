package day_038;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumbersWithSameConsecutiveDifferencesTest {

    @Test
    void shouldReturnValidResultsForThreeDigitTarget() {
        int[] expected = new int[]{181, 292, 707, 818, 929};
        assertArrayEquals(expected, new NumbersWithSameConsecutiveDifferences().numsSameConsecDiff(3, 7));
    }

    @Test
    void shouldReturnValidResultsForTwoDigitTarget() {
        List<Integer> expected = Arrays.asList(10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98);
        assertThat(expected).hasSameElementsAs(
                Arrays.stream(new NumbersWithSameConsecutiveDifferences().numsSameConsecDiff(2, 1))
                        .boxed()
                        .collect(Collectors.toList()));
    }
}