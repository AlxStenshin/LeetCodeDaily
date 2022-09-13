package day_047;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagOfTokensTest {
    BagOfTokens bagOfTokens = new BagOfTokens();

    @Test
    void shouldReturnZero() {
        // Explanation: Playing the only token in the bag is impossible because you either have too little power or too little score.
        assertEquals(0, bagOfTokens.bagOfTokensScore(new int[]{100}, 50));
    }

    @Test
    void shouldReturnOne() {
        // Explanation: Play the 0th token (100) face up, your power becomes 50 and score becomes 1.
        // There is no need to play the 1st token since you cannot play it face up to add to your score.
        assertEquals(1, bagOfTokens.bagOfTokensScore(new int[]{100, 200}, 150));
    }

    @Test
    void shouldReturnTwo() {
        // Explanation: Play the tokens in this order to get a score of 2:
        // 1. Play the 0th token (100) face up, your power becomes 100 and score becomes 1.
        // 2. Play the 3rd token (400) face down, your power becomes 500 and score becomes 0.
        // 3. Play the 1st token (200) face up, your power becomes 300 and score becomes 1.
        // 4. Play the 2nd token (300) face up, your power becomes 0 and score becomes 2.
        assertEquals(2, bagOfTokens.bagOfTokensScore(new int[]{100, 200, 300, 400}, 200));
    }

}