package day_125;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/insert-delete-getrandom-o1/">
 * 380. Insert Delete GetRandom O(1) </a>
 * <p>
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.<br>
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.<br>
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.<br>
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.<p>
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 */

public class RandomizedSet {
    private final ArrayList<Integer> elementNums;
    private final HashMap<Integer, Integer> elements;
    private final java.util.Random random = new java.util.Random();

    public RandomizedSet() {
        elementNums = new ArrayList<>();
        elements = new HashMap<>();
    }

    public boolean insert(int val) {
        if (elements.containsKey(val))
            return false;

        elements.put(val, elementNums.size());
        elementNums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!elements.containsKey(val))
            return false;

        int position = elements.get(val);
        if (position < elementNums.size() - 1) {
            int lastElement = elementNums.get(elementNums.size() - 1);
            elementNums.set(position, lastElement);
            elements.put(lastElement, position);
        }
        elements.remove(val);
        elementNums.remove(elementNums.size() - 1);
        return true;
    }

    public int getRandom() {
        return elementNums.get( random.nextInt(elementNums.size()) );
    }
}
