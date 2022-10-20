package day_085;

import java.util.TreeMap;

/**
 * <a href = "https://leetcode.com/problems/integer-to-roman/">
 * 12. Integer to Roman</a>
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value<p>
 * I             1<p>
 * V             5<p>
 * X             10<p>
 * L             50<p>
 * C             100<p>
 * D             500<p>
 * M             1000<p>
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9. <p>
 * X can be placed before L (50) and C (100) to make 40 and 90. <p>
 * C can be placed before D (500) and M (1000) to make 400 and 900.<p>
 * Given an integer, convert it to a roman numeral.
 */

public class IntegerToRoman {
    public String intToRoman(int num) {
        TreeMap<Integer, String> dictionary = new TreeMap<>();
        dictionary.put(1, "I");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(9, "IX");
        dictionary.put(10, "X");
        dictionary.put(40, "XL");
        dictionary.put(50, "L");
        dictionary.put(90, "XC");
        dictionary.put(100, "C");
        dictionary.put(400, "CD");
        dictionary.put(500, "D");
        dictionary.put(900, "CM");
        dictionary.put(1000, "M");

        StringBuilder roman = new StringBuilder();
        while (num > 0) {
            int nearestNum = dictionary.floorKey(num);
            roman.append(dictionary.get(nearestNum));
            num = num - nearestNum;
        }

        return roman.toString();
    }
}
