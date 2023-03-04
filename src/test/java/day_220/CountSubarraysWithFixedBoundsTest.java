package day_220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSubarraysWithFixedBoundsTest {

    @Test
    void shouldReturnTwo() {
        int[] nums =  {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;

        assertEquals(2, new CountSubarraysWithFixedBounds().countSubarrays(nums, minK, maxK));
    }


    @Test
    void shouldReturnTen() {
        int[] nums = {1, 1, 1, 1};
        int minK = 1;
        int maxK = 1;

        assertEquals(10, new CountSubarraysWithFixedBounds().countSubarrays(nums, minK, maxK));
    }

}