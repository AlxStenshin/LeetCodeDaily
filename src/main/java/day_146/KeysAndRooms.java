package day_146;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/keys-and-rooms/">
 * 841. Keys and Rooms</a>
 * <p>
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 * <p>
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 * <p>
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 */

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        openRoom(0, rooms, visited);
        return visited.size() == rooms.size();
    }

    private void openRoom(int room, List<List<Integer>> rooms, Set<Integer> visited) {
        visited.add(room);
        for (int key : rooms.get(room))
            if (!visited.contains(key))
                openRoom(key, rooms, visited);
    }
}
