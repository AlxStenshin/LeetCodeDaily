package day_100;

import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/reverse-vowels-of-a-string/">
 * 345. Reverse Vowels of a String</a>
 * <p>
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        List<Character> vowelDictionary = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int startPointer = 0;
        int endPointer = s.length() - 1;
        char startVowel = 0, endVowel = 0;

        char[] result = s.toCharArray();

        while (startPointer < endPointer) {
            if (vowelDictionary.contains(result[startPointer]))
                startVowel = result[startPointer];
            else startPointer++;

            if (vowelDictionary.contains(result[endPointer]))
                endVowel = result[endPointer];
            else endPointer--;

            if (startVowel != 0 && endVowel != 0) {
                result[startPointer] = endVowel;
                result[endPointer] = startVowel;

                startPointer++;
                endPointer--;
                startVowel = 0;
                endVowel = 0;
            }
        }
        return new String(result);
    }
}
