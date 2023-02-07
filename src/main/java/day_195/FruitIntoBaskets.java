package day_195;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/fruit-into-baskets/">
 * 904. Fruit Into Baskets </a>
 * <p>
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 * <p>
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 * <p>
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.<br>
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.<br>
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * <p>
 * Given the integer array fruits, return the maximum number of fruits you can pick.<br>
 */

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int leftPointer = 0, rightPointer = 0; rightPointer < fruits.length; ++rightPointer) {
            count.put(fruits[rightPointer], count.getOrDefault(fruits[rightPointer], 0) + 1);

            while (count.size() > 2) {
                count.put(fruits[leftPointer], count.get(fruits[leftPointer]) - 1);
                count.remove(fruits[leftPointer], 0);
                ++leftPointer;
            }
            result = Math.max(result, rightPointer - leftPointer + 1);
        }

        return result;
    }
}
