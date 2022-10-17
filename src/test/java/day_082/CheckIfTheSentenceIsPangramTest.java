package day_082;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTheSentenceIsPangramTest {

    @Test
    void shouldReturnTrue() {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        assertTrue(new CheckIfTheSentenceIsPangram().checkIfPangram(input));
    }

    @Test
    void shouldReturnFalse() {
        String input = "leetcode";
        assertFalse(new CheckIfTheSentenceIsPangram().checkIfPangram(input));
    }

}