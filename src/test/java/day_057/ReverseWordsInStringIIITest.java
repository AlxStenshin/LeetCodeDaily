package day_057;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringIIITest {

    @Test
    void shouldReturnReversedString() {
        String input = "Let's take LeetCode contest";
        String output =  "s'teL ekat edoCteeL tsetnoc";

        assertEquals(output, new ReverseWordsInStringIII().reverseWords(input));
    }

}