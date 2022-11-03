package day_098;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/minimum-genetic-mutation/">
 * 433. Minimum Genetic Mutation </a>
 * <p>
 * A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G', and 'T'.
 * <p>
 * Suppose we need to investigate a mutation from a gene string start to a gene string end where one mutation is defined as one single character changed in the gene string.
 * <p>
 * For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
 * <p>
 * There is also a gene bank bank that records all the valid gene mutations. A gene must be in bank to make it a valid gene string.
 * <p>
 * Given the two gene strings start and end and the gene bank bank, return the minimum number of mutations needed to mutate from start to end. If there is no such a mutation, return -1.
 * <p>
 * Note that the starting point is assumed to be valid, so it might not be included in the bank.
 */

public class MinimumGeneticMutation {

    public int minMutation(String start, String end, String[] bank) {
        int res = mutate(start, end, bank);

        if (res == Integer.MAX_VALUE)
            return -1;

        return res;
    }

    int mutate(String start, String end, String[] bank) {
        if (start.equals(end))
            return 0;

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < bank.length; i++) {
            if (getMutations(start, bank[i]) == 1) {
                String d = bank[i];
                bank[i] = "--------";
                res = Math.min(res, mutate(d, end, bank));
                bank[i] = d;
            }
        }

        if (res == Integer.MAX_VALUE)
            return res;

        return res + 1;
    }

    int getMutations(String input, String reference) {
        int res = 0;
        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) != reference.charAt(i))
                res++;
        return res;
    }

    // Hash Maps Solution
    public int minMutationHashMaps(String start, String end, String[] bank) {
        int mutationsRequired = getMutationCount(start, end);
        int mutationsPossible = 0;

        for (var s : bank) {
            if (getMutationCount(start, s) == 1) {
                start = s;
                mutationsPossible++;
            }
        }
        return mutationsPossible >= mutationsRequired ? mutationsRequired : -1;
    }

    private int getMutationCount(String input, String reference) {
        final var inputMap = getMutationMap(input);
        final var refMap = getMutationMap(reference);

        int difference = 0;
        for (var e : inputMap.entrySet()) {
            difference += Math.abs(e.getValue() - refMap.getOrDefault(e.getKey(), 0));
        }
        return difference / 2;
    }

    private HashMap<Character, Integer> getMutationMap(String mutation) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (Character c : mutation.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}
