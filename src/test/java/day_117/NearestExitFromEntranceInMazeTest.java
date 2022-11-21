package day_117;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearestExitFromEntranceInMazeTest {
    
    @Test
    void shouldExitInOneStep() {
        char[][] maze = new char[][]{
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}};
        int[] entrance = new int[]{1, 2};

        assertEquals(1, new NearestExitFromEntranceInMaze().nearestExit(maze, entrance));
    }

    @Test
    void shouldExitInTwoSteps() {
        char[][] maze = new char[][]{
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}};
        int[] entrance = new int[]{1, 0};

        assertEquals(2, new NearestExitFromEntranceInMaze().nearestExit(maze, entrance));
    }

    @Test
    void shouldNotExitTheMaze() {
        char[][] maze = new char[][]{{'.', '+'}};
        int[] entrance = new int[]{0, 0};

        assertEquals(-1, new NearestExitFromEntranceInMaze().nearestExit(maze, entrance));
    }

}