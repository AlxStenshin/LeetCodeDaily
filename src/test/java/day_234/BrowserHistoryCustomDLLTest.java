package day_234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrowserHistoryCustomDLLTest {
    @Test
    void shouldPerformCorrectBahavior() {
        BrowserHistoryCustomDLL browserHistoryCustomDLL = new BrowserHistoryCustomDLL("leetcode.com");
        browserHistoryCustomDLL.visit("google.com");
        browserHistoryCustomDLL.visit("facebook.com");
        browserHistoryCustomDLL.visit("youtube.com");
        assertEquals("facebook.com", browserHistoryCustomDLL.back(1));
        assertEquals("google.com", browserHistoryCustomDLL.back(1));
        assertEquals("facebook.com", browserHistoryCustomDLL.forward(1));
        browserHistoryCustomDLL.visit("linkedin.com");
        assertEquals("linkedin.com", browserHistoryCustomDLL.forward(2));
        assertEquals("google.com", browserHistoryCustomDLL.back(2));
        assertEquals("leetcode.com", browserHistoryCustomDLL.back(7));
    }

}