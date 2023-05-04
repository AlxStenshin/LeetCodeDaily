package day_281;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dota2SenateTest {

    @Test
    void shouldReturnRadiant() {
        String senate = "RD";
        String expected = "Radiant";
        assertEquals(expected, new Dota2Senate().predictPartyVictory(senate));
    }

    @Test
    void shouldReturnDire() {
        String senate = "RDD";
        String expected = "Dire";
        assertEquals(expected, new Dota2Senate().predictPartyVictory(senate));
    }

}