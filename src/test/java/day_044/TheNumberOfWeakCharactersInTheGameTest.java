package day_044;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheNumberOfWeakCharactersInTheGameTest {

    TheNumberOfWeakCharactersInTheGame theGame = new TheNumberOfWeakCharactersInTheGame();

    @Test
    void shouldReturnZero() {
        assertEquals(0, theGame.numberOfWeakCharacters(new int[][]{{5, 5}, {6, 3}, {3, 6}}));
    }

    @Test
    void shouldReturnOneWithTrivialInput() {
        assertEquals(1, theGame.numberOfWeakCharacters(new int[][]{{2, 2}, {3, 3}}));
    }

    @Test
    void shouldReturnOneWithMoreComplexInput() {
        assertEquals(1, theGame.numberOfWeakCharacters(new int[][]{{1, 5}, {10, 4}, {4, 3}}));
    }

    @Test
    void shouldReturnSix() {
        assertEquals(6, theGame.numberOfWeakCharacters(
                new int[][]{{7, 7}, {1, 2}, {9, 7}, {7, 3}, {3, 10}, {9, 8}, {8, 10}, {4, 3}, {1, 5}, {1, 5}}));
    }
}