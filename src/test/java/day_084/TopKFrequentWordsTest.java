package day_084;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentWordsTest {

    @Test
    void shouldReturn_The_Is_Sunny_Day() {
        String[] input = new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"};
        List<String> expected = List.of("the","is","sunny","day");
        assertEquals(expected, new TopKFrequentWords().topKFrequent(input, 4));
    }

    @Test
    void shouldReturn_I_Love() {
        String[] input = new String[] {"i","love","leetcode","i","love","coding"};
        List<String> expected = List.of("i", "love");
        assertEquals(expected, new TopKFrequentWords().topKFrequent(input, 2));
    }
}