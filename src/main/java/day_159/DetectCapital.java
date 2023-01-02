package day_159;

/**
 * <a href = "https://leetcode.com/problems/detect-capital/">
 * 520. Detect Capital </a>
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".<br>
 * All letters in this word are not capitals, like "leetcode".<br>
 * Only the first letter in this word is capital, like "Google".<br>
 * Given a string word, return true if the usage of capitals in it is right.<br>
 */

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        char[] wordChars = word.toCharArray();

        for (int i = 0; i < wordChars.length; i++) {
            wordChars[i] = isCapital(wordChars[i]) ? '1' : '0';
        }

        if (wordChars[0] == '1') {
            int capitalCount = 1;
            for (int i = 1; i < wordChars.length; i++) {
                if (wordChars[i] == '1')
                    capitalCount++;
            }
            if (capitalCount != wordChars.length)
                return capitalCount == 1;

        } else {
            for (int i = 1; i < wordChars.length; i++) {
                if (wordChars[i] == '1')
                    return false;
            }
        }
        return true;
    }

    boolean isCapital(char c) {
        return c <= 'Z';
    }
}
