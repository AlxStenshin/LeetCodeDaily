package day_160;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteColumnsToMakeSortedTest {

    @Test
    void shouldReturnOne() {
        String[] strs = {"cba", "daf", "ghi"};
        assertEquals(1, new DeleteColumnsToMakeSorted().minDeletionSize(strs));
    }

    @Test
    void shouldReturnZero() {
        String[] strs = {"a", "b"};
        assertEquals(0, new DeleteColumnsToMakeSorted().minDeletionSize(strs));
    }

    @Test
    void shouldReturnThree() {
        String[] strs = {"zyx", "wvu", "tsr"};
        assertEquals(3, new DeleteColumnsToMakeSorted().minDeletionSize(strs));
    }

}