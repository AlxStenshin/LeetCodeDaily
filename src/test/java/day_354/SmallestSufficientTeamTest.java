package day_354;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSufficientTeamTest {
    @Test
    void shouldReturnZeroTwo() {
        String[] req_skills = {"java", "nodejs", "reactjs"};
        List<List<String>> people = List.of(List.of("java"), List.of("nodejs"), List.of("nodejs", "reactjs"));

        assertArrayEquals(new int[]{0, 2}, new SmallestSufficientTeam().smallestSufficientTeam(req_skills, people));
    }

    @Test
    void shouldReturnOneTwo() {
        String[] req_skills = {"algorithms", "math", "java", "reactjs", "csharp", "aws"};
        List<List<String>> people = List.of(
                List.of("algorithms", "math", "java"),
                List.of("algorithms", "math", "reactjs"),
                List.of("java", "csharp", "aws"),
                List.of("reactjs", "csharp"),
                List.of("csharp", "math"),
                List.of("aws", "java")
        );

        assertArrayEquals(new int[]{1, 2}, new SmallestSufficientTeam().smallestSufficientTeam(req_skills, people));
    }

}