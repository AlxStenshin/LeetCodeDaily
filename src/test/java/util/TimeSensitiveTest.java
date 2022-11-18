package util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeSensitiveTest {

    private long startTime = 0;
    private int maxAllowedTime = 25;

    @BeforeEach
    void startTimer() {
        startTime = System.nanoTime();
    }

    @AfterEach

    void stopTimer(TestInfo testInfo) {
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(testInfo.getTestClass() + testInfo.getDisplayName() +
                " Execution Took " + elapsedTime / 1_000_000 + " ms.");
        assertTrue(elapsedTime / 1_000_000 <= maxAllowedTime);
    }

    public void setMaxAllowedTime(int maxAllowedTime) {
        this.maxAllowedTime = maxAllowedTime;
    }
}
