package day_219;

/**
 * <a href = "https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">
 * 28. Find the Index of the First Occurrence in a String </a>
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        int haystackPointer = 0;

        while (haystackPointer <= haystack.length() - needle.length()) {
            if (haystack.charAt(haystackPointer) == needle.charAt(0)) {
                for (int needlePointer = 0; needlePointer < needle.length(); needlePointer++) {

                    if (haystack.charAt(haystackPointer + needlePointer) != needle.charAt(needlePointer))
                        break;

                    if (needlePointer == needle.length() - 1)
                        return haystackPointer;
                }
            }
            haystackPointer++;
        }
        return -1;
    }
}



