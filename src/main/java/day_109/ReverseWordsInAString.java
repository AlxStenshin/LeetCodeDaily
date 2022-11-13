package day_109;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * <a href = "https://leetcode.com/problems/reverse-words-in-a-string/">
 * 151. Reverse Words in a String </a>
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] filteredArray = Arrays.stream(s.trim().split(" "))
                .filter(Predicate.not(String::isBlank)).toArray(String[]::new);
        int firstPointer = 0;
        int secondPointer = filteredArray.length - 1;

        while (firstPointer < secondPointer) {
            String temp = filteredArray[firstPointer];
            filteredArray[firstPointer] = filteredArray[secondPointer];
            filteredArray[secondPointer] = temp;
            firstPointer++;
            secondPointer--;
        }
        return String.join(" ", filteredArray);
    }
}