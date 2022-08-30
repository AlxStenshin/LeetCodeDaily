package day_034;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    void shouldBeRotated() {
        int[][] sourceImage = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] targetImage = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        new RotateImage().rotate(sourceImage);
        assertArrayEquals(sourceImage, targetImage);
    }
}