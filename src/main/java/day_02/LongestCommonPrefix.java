package day_02;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int shortest = Arrays.stream(strs).map(String::length).reduce(Math::min).orElse(0);
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < shortest; i++) {
            char c = strs[0].charAt(i);

            for (String str : strs)
                if (str.charAt(i) != c)
                    return prefix.toString();

            prefix.append(c);
        }

        return prefix.toString();
    }
}
