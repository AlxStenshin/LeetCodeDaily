package day_120;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void shouldFindTargetWord_ABCCD() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        String word = "ABCCED";
        assertTrue(new WordSearch().exist(board, word));
    }

    @Test
    void shouldFindTargetWord_SEE() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        String word = "SEE";
        assertTrue(new WordSearch().exist(board, word));
    }

    @Test
    void shouldNotFindTargetWord_ABCB() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        String word = "ABCB";
        assertFalse(new WordSearch().exist(board, word));
    }

    @Test
    void shouldFindTargetWord_a() {
        char[][] board = {{'a'}};
        String word = "a";
        assertTrue(new WordSearch().exist(board, word));
    }

    @Test
    void shouldFindTargetWord_aa() {
        char[][] board = {{'a', 'a'}};
        String word = "aa";
        assertTrue(new WordSearch().exist(board, word));
    }

    @Test
    void shouldFindTargetWord_acdb() {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String word = "acdb";
        assertTrue(new WordSearch().exist(board, word));
    }
}