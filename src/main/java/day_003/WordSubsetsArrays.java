package day_003;

import java.util.ArrayList;
import java.util.List;

public class WordSubsetsArrays {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] words2Freq = getMaxFrequencies(words2);

        for (String s : words1) {
            int[] word1Freq = getFrequency(s);
            boolean flag = true;
            for (int j = 0; j < 26; j++) {
                if (word1Freq[j] < words2Freq[j]) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                result.add(s);
            }
        }
        return result;
    }

    public int[] getMaxFrequencies(String[] word2) {
        int[] max = new int[26];
        for (String s : word2) {
            int[] wordFrequencies = getFrequency(s);

            for (int j = 0; j < 26; j++) {
                max[j] = Math.max(max[j], wordFrequencies[j]);
            }
        }
        return max;
    }

    public int[] getFrequency(String s) {
        int[] frequencies = new int[26];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        return frequencies;
    }

}
