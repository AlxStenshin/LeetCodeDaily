package day_12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class FindAllAnagramsInStringTest {

    @Test
    void shouldReturn_ZeroSix() {
        assertThat(new FindAllAnagramsInString().findAnagrams("cbaebabacd", "abc"),
                containsInAnyOrder(0, 6));
    }

    @Test
    void shouldReturn_ZeroOneTwo() {
        assertThat(new FindAllAnagramsInString().findAnagrams("abab", "ab"),
                containsInAnyOrder(0, 1, 2));
    }
}