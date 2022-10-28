package util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeSensitiveTest {
    private long startTime = 0;

    @BeforeEach
    void startTimer() {
        startTime = System.nanoTime();
    }

    @AfterEach

    void stopTimer() {
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Test Execution Took " + elapsedTime / 1_000_000 + " ms.");
        assertTrue(elapsedTime / 1_000_000 <= 25);
    }
}
