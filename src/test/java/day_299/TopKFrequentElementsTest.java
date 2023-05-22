package day_299;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void shouldReturnOneAndTwo(){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] expected = {1,2};
        assertArrayEquals(expected, new TopKFrequentElements().topKFrequent(nums, k));
    }

    @Test
    void shouldReturnOne(){
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        assertArrayEquals(expected, new TopKFrequentElements().topKFrequent(nums, k));
    }

}