package day_234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrowserHistoryLinkedListTest {
    @Test
    void shouldPerformCorrectBehavior() {
        BrowserHistoryLinkedList browserHistory = new BrowserHistoryLinkedList("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        assertEquals("facebook.com", browserHistory.back(1));
        assertEquals("google.com", browserHistory.back(1));
        assertEquals("facebook.com", browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        assertEquals("linkedin.com", browserHistory.forward(2));
        assertEquals("google.com", browserHistory.back(2));
        assertEquals("leetcode.com", browserHistory.back(7));
    }

}