package day_195;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitIntoBasketsTest {

    @Test
    void shouldReturnThreeWithThreeElementsInput() {
        int[] fruits = {1, 2, 1};
        assertEquals(3, new FruitIntoBaskets().totalFruit(fruits));
    }

    @Test
    void shouldReturnThree() {
        int[] fruits = {0, 1, 2, 2};
        assertEquals(3, new FruitIntoBaskets().totalFruit(fruits));
    }

    @Test
    void shouldReturnTFour() {
        int[] fruits = {1, 2, 3, 2, 2};
        assertEquals(4, new FruitIntoBaskets().totalFruit(fruits));
    }

}