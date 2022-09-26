package day_061;

import java.util.*;

/**
 * <a href=https://leetcode.com/problems/satisfiability-of-equality-equations/">
 *     990. Satisfiability of Equality Equations</a>
 * <p>
 * You are given an array of strings equations that represent relationships between variables
 * where each string equations[i] is of length 4 and takes one of two different forms:
 * <p>
 * "xi==yi" or "xi!=yi". Here, xi and yi are lowercase letters
 * (not necessarily different) that represent one-letter variable names.
 * <p>
 * Return true if it is possible to assign integers to variable names so as to satisfy all the given equations, or false otherwise.
 */

public class SatisfiabilityOfEqualityEquations {

    public boolean equationsPossible(String[] equations) {
        Arrays.sort(equations, (a, b) -> {
            if (a.charAt(1) != b.charAt(1))
                return Character.compare(b.charAt(1), a.charAt(1));
            else
                return a.compareTo(b);
        });

        HashMap<Character, HashSet<Character>> graph = new HashMap<>();

        for (String s : equations) {
            Character first = s.charAt(0);
            Character second = s.charAt(3);

            if (s.charAt(1) == '=') {
                graph.putIfAbsent(first, new HashSet<>());
                graph.putIfAbsent(second, new HashSet<>());

                for (char c : graph.get(second))
                    graph.get(first).add(c);

                graph.get(first).add(second);

                for (char c : graph.get(first))
                    graph.get(second).add(c);

                graph.get(second).add(first);
            } else {
                if (first == second)
                    return false;

                graph.putIfAbsent(first, new HashSet<>());
                graph.putIfAbsent(second, new HashSet<>());

                for (char c : graph.get(first)) {
                    if (graph.get(c).contains(second))
                        return false;
                }
                for (char c : graph.get(second)) {
                    if (graph.get(c).contains(first))
                        return false;
                }
            }
        }
        return true;
    }
}
