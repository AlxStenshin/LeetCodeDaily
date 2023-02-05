package day_125;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void shouldPerformCorrectRandomizedSetBehavior() {
        RandomizedSet randomizedSet = new RandomizedSet();

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertTrue(randomizedSet.insert(1));

        // Returns false as 2 does not exist in the set.
        assertFalse(randomizedSet.remove(2));

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        assertTrue(randomizedSet.insert(2));

        // getRandom() should return either 1 or 2 randomly.
        List<Integer> expectedResults = List.of(1, 2);
        assertTrue(expectedResults.contains(randomizedSet.getRandom()));

        // Removes 1 from the set, returns true. Set now contains [2].
        assertTrue(randomizedSet.remove(1));

        // 2 was already in the set, so return false.
        assertFalse(randomizedSet.insert(2));

        // Since 2 is the only number in the set, getRandom() will always return 2.
        assertEquals(2, randomizedSet.getRandom());
    }
}