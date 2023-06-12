package day_320;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void shouldReturnZeroTwoFourFiveAndSeven() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        assertEquals(List.of("0->2", "4->5", "7"), new SummaryRanges().summaryRanges(nums));
    }

    @Test
    void shouldReturnZeroAndTwoFourAndSixAndEightNine() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        assertEquals(List.of("0", "2->4", "6", "8->9"), new SummaryRanges().summaryRanges(nums));
    }

}