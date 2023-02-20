package day_208;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void shouldReturnTwo() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        assertEquals(2, new SearchInsertPosition().searchInsert(nums, target));
    }

    @Test
    void shouldReturnOne() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        assertEquals(1, new SearchInsertPosition().searchInsert(nums, target));
    }

    @Test
    void shouldReturnFour() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        assertEquals(4, new SearchInsertPosition().searchInsert(nums, target));
    }

}