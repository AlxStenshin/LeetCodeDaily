package day_124;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/find-players-with-zero-or-one-losses/">
 * 2225. Find Players With Zero or One Losses </a>
 * <p>
 * You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
 * <p>
 * Return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all players that have not lost any matches.<br>
 * answer[1] is a list of all players that have lost exactly one match.<br>
 * The values in the two lists should be returned in increasing order.<br>
 */

public class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> playerLoses = new HashMap<>();
        for (var match : matches) {
            int winner = match[0];
            int looser = match[1];
            playerLoses.put(winner, playerLoses.getOrDefault(winner, 0));
            playerLoses.put(looser, playerLoses.getOrDefault(looser, 0) + 1);
        }

        List<Integer> winners = playerLoses.entrySet().stream()
                .filter(e -> e.getValue() == 0)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());


        List<Integer> oneMatchLosers = playerLoses.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        return List.of(winners, oneMatchLosers);
    }
}
