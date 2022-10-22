package day_087;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] count = new int[128];

        // Count the characters in t
        for (char ch : t.toCharArray())
            count[ch]++;

        char[] sourceStr = s.toCharArray();
        String windowString = "";
        int windowLeft = 0;
        int windowRight = 0;
        int charsFoundInWindow = 0;
        int totalCharsToFind = t.length();
        int minWindowLen = Integer.MAX_VALUE;

        while (windowRight < sourceStr.length) {
            int currentChar = sourceStr[windowRight];
            // Reduce the count of current character
            count[currentChar]--;
            // If current character's count is greater thant or equal to 0 if it was also present in target string t
            // and we can say that we have found that character in current window so we increment charsFoundInWindow
            if (count[currentChar] >= 0) {
                charsFoundInWindow++;
            }

            // If we found a window containing all characters of t, find if its smaller than the smallest window
            // If yes, store the window in windowString to return finally.
            while (charsFoundInWindow == totalCharsToFind) {
                int currentWindowLen = windowRight - windowLeft + 1;
                if(minWindowLen > currentWindowLen) {
                    minWindowLen = currentWindowLen;
                    windowString = s.substring(windowLeft, windowRight + 1);
                }
                // Now we need to reduce the window size from left to further look for smaller windows.
                // The current leftmost character was already visited by right pointer windowRight earlier
                // and we had reduced its count in count[]. So now we increment it because
                // we need the count of that character in the remaining window.
                count[sourceStr[windowLeft]]++;
                // Now if the last character is greater than 0, it means that character was present in t but
                // is not present in current window so we have to decrement charsFoundInWindow
                if (count[sourceStr[windowLeft]] > 0) {
                    charsFoundInWindow--;
                }
                windowLeft++;
            }
            windowRight++;
        }
        return windowString;
    }
}
