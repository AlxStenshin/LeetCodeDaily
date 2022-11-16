package day_112;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @Test
    void shouldReturnSix() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower();
        guess.setTargetNumber(6);
        assertEquals(6, guess.guessNumber(6));
    }

    @Test
    void shouldReturnOne() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower();
        guess.setTargetNumber(1);
        assertEquals(1, guess.guessNumber(1));
    }

    @Test
    void shouldAlsoReturnOne() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower();
        guess.setTargetNumber(2);
        assertEquals(2, guess.guessNumber(1));
    }
}