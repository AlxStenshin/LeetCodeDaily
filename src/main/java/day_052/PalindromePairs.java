package day_052;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/palindrome-pairs/">
 *     336. Palindrome Pairs</a>
 * <p>
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list,
 * so that the concatenation of the two words words[i] + words[j] is a palindrome.
 */

public class PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        int wordsCount = words.length;

        for (int i = 0; i < wordsCount; i++) {
            wordMap.put(words[i], i);
            set.add(words[i].length());
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            int length = words[i].length();

            if (length == 1) {
                if (wordMap.containsKey("")) {
                    ans.add(Arrays.asList(i, wordMap.get("")));
                    ans.add(Arrays.asList(wordMap.get(""), i));
                }
                continue;
            }

            String reverse = new StringBuilder(words[i]).reverse().toString();
            if (wordMap.containsKey(reverse) && wordMap.get(reverse) != i)
                ans.add(Arrays.asList(i, wordMap.get(reverse)));

            for (Integer k : set) {
                if (k == length)
                    break;

                if (isPalindrome(reverse, 0, length - 1 - k)) {
                    String s1 = reverse.substring(length - k);
                    if (wordMap.containsKey(s1))
                        ans.add(Arrays.asList(i, wordMap.get(s1)));
                }

                if (isPalindrome(reverse, k, length - 1)) {
                    String s2 = reverse.substring(0, k);
                    if (wordMap.containsKey(s2))
                        ans.add(Arrays.asList(wordMap.get(s2), i));
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left<right)
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        return true;
    }
}