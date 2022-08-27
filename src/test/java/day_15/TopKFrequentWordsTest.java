package day_15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentWordsTest {

    @Test
    void shouldReturn_I_Love() {
        List<String> expected = List.of("i", "love");
        assertEquals(new TopKFrequentWords().topKFrequent(
                new String[] {"i","love","leetcode","i","love","coding"}, 2),
                expected);
    }

}