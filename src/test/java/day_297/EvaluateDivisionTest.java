package day_297;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionTest {

    @Test
    void shouldPerformCorrectBehaviour() {
        double[] values = {2.0, 3.0};
        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c"));
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x"));

        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};

        assertArrayEquals(expected, new EvaluateDivision().calcEquation(equations, values, queries));
    }

    @Test
    void shouldAlsoPerformCorrectBehaviour() {
        double[] values = {1.5,2.5,5.0};
        List<List<String>> equations = List.of(
                List.of("a","b"),
                List.of("b","c"),
                List.of("bc","cd"));
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("c", "b"),
                List.of("bc", "cd"),
                List.of("cd", "bc"));

        double[] expected = {3.75, 0.4, 5.0, 0.2};
        assertArrayEquals(expected, new EvaluateDivision().calcEquation(equations, values, queries));
    }

}