package day_189;

/**
 * <a href = "https://leetcode.com/problems/greatest-common-divisor-of-strings/">
 * 1071. Greatest Common Divisor of Strings </a>
 * <p>
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {

        if (str2.equals(str1))
            return str1;

        if (str2.length() > str1.length())
            return gcdOfStrings(str2, str1);

        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);

        return "";
    }

}
