package day_106;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringTest {

    String veryLongString; {
        StringBuilder builder = new StringBuilder("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        veryLongString = String.valueOf(builder.append(String.valueOf(builder).repeat(255)));
    }

    @Test
    void shouldReturn_ca_StringBuilder() {
        assertEquals("ca", new RemoveAllAdjacentDuplicatesInString().removeDuplicatesStringBuilder("abbaca"));
    }

    @Test
    void shouldReturn_ca_twoPointers() {
        assertEquals("ca", new RemoveAllAdjacentDuplicatesInString().removeDuplicatesStringBuilder("abbaca"));
    }

    @Test
    void shouldReturn_ca() {
        assertEquals("ca", new RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbaca"));
    }

    @Test
    void shouldReturn_ay_StringBuilder() {
        assertEquals("ay", new RemoveAllAdjacentDuplicatesInString().removeDuplicatesStringBuilder("azxxzy"));
    }

    @Test
    void shouldReturn_ay_TwoPointers() {
        assertEquals("ay", new RemoveAllAdjacentDuplicatesInString().removeDuplicatesTwoPointers("azxxzy"));
    }

    @Test
    void shouldReturn_ay() {
        assertEquals("ay", new RemoveAllAdjacentDuplicatesInString().removeDuplicates("azxxzy"));
    }

    @Test
    void shouldReturnSameString() {
        assertEquals(veryLongString, new RemoveAllAdjacentDuplicatesInString().removeDuplicates(veryLongString));
    }

    @Test
    void shouldReturnSameString_StringBuilder() {
        assertEquals(veryLongString, new RemoveAllAdjacentDuplicatesInString().removeDuplicatesStringBuilder(veryLongString));
    }

    @Test
    void shouldReturnSameString_TwoPointers() {
        assertEquals(veryLongString, new RemoveAllAdjacentDuplicatesInString().removeDuplicatesTwoPointers(veryLongString));
    }

}