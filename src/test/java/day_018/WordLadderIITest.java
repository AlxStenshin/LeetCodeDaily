package day_018;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderIITest {

    /**
     * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
     * Output: [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
     * Explanation: There are 2 shortest transformation sequences:
     * "hit" -> "hot" -> "dot" -> "dog" -> "cog"
     * "hit" -> "hot" -> "lot" -> "log" -> "cog"
     */

    @Test
    void shouldReturnCorrectValues() {
        assertEquals(List.of(List.of("hit", "hot", "dot", "dog", "cog"), List.of("hit", "hot", "lot", "log", "cog")),
                new WordLadderII().findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    /**
     * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
     * Output: []
     * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
     */

    @Test
    void shouldReturnEmptyList() {
        assertEquals(List.of(),
                new WordLadderII().findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }
}
