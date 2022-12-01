package day_127;

import java.util.HashSet;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/determine-if-string-halves-are-alike/">
 * 1704. Determine if String Halves Are Alike </a>
 * <p>
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * <p>
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * <p>
 * Return true if a and b are alike. Otherwise, return false.
 */

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlikeHashSet(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray())
            set.add(c);

        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(s.charAt(i))) count++;
            if (set.contains(s.charAt(i + s.length() / 2))) count--;
        }

        return count == 0;
    }

    final List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    public boolean halvesAreAlike(String s) {
        int firstPointer = 0;
        int secondPointer = s.length() - 1;

        int vowelsCount = 0;

        while (firstPointer < secondPointer){
            if (vowels.contains(s.charAt(firstPointer)))
                vowelsCount++;

            if (vowels.contains(s.charAt(secondPointer)))
                vowelsCount--;

            firstPointer++;
            secondPointer--;
        }
        return vowelsCount == 0;
    }
}
