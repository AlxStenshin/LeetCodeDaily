package day_025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampingTheSequenceTest {

    @Test
    void shouldReturnZeroTwo() {
        assertArrayEquals(new int[]{0, 2}, new StampingTheSequence().movesToStamp("abc", "ababc"));
    }

    @Test
    void shouldReturnThreeZeroOne() {
        //Input: stamp = "abca", target = "aabcaca"
        //Output: [3,0,1]
        assertArrayEquals(new int[]{0, 3, 1}, new StampingTheSequence().movesToStamp("abca", "aabcaca"));
    }

}