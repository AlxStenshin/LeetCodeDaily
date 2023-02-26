package day_214;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    @Test
    void shouldReturnThree_Recursion() {
        String word1 = "horse";
        String word2 = "ros";

        assertEquals(3, new EditDistance().minDistanceRecursion(word1, word2));
    }

    @Test
    void shouldReturnFive_Recursion() {
        String word1 = "intention";
        String word2 = "execution";

        assertEquals(5, new EditDistance().minDistanceRecursion(word1, word2));
    }

    @Test
    void shouldReturnThree_DP_TopDown() {
        String word1 = "horse";
        String word2 = "ros";

        assertEquals(3, new EditDistance().minDistance_DP_TopDown(word1, word2));
    }

    @Test
    void shouldReturnFive_DP_TopDown() {
        String word1 = "intention";
        String word2 = "execution";

        assertEquals(5, new EditDistance().minDistance_DP_TopDown(word1, word2));
    }

    @Test
    void shouldReturnThree_DP_Tabulation() {
        String word1 = "horse";
        String word2 = "ros";

        assertEquals(3, new EditDistance().minDistance_DP_Tabulation(word1, word2));
    }

    @Test
    void shouldReturnFive_DP_Tabulation() {
        String word1 = "intention";
        String word2 = "execution";

        assertEquals(5, new EditDistance().minDistance_DP_Tabulation(word1, word2));
    }

}