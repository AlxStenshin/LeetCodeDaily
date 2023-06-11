package day_319;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnapshotArrayTest {

    @Test
    void shouldPerformCorrectBehavior() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        assertEquals(0, snapshotArr.snap());
        snapshotArr.set(0, 6);
        assertEquals(5, snapshotArr.get(0, 0));
    }
}