package day_325;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeArrayStrictlyIncreasingTest {
    @Test
    void shouldReturnOne() {
        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {1,3,2,4};

        assertEquals(1, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(arr1, arr2));
    }

    @Test
    void shouldReturnTwo() {
        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {4,3,1};

        assertEquals(2, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(arr1, arr2));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {1,6,3,3};

        assertEquals(-1, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(arr1, arr2));
    }
}