package day_197;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NamingACompanyTest {

    @Test
    void shouldReturnSix() {
        String[] ideas = {"coffee","donuts","time","toffee"};

        assertEquals(6, new NamingACompany().distinctNames(ideas));
    }

    @Test
    void shouldReturnZero() {
        String[] ideas = {"lack","back"};

        assertEquals(0, new NamingACompany().distinctNames(ideas));
    }

}