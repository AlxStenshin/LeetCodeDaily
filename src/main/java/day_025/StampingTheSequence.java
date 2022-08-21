package day_025;

import java.util.ArrayList;
import java.util.List;

/**
 * 936. Stamping The Sequence
 * https://leetcode.com/problems/stamping-the-sequence/
 *
 * You are given two strings stamp and target.
 * Initially, there is a string s of length target.length with all s[i] == '?'.
 *
 * In one turn, you can place stamp over s and replace every letter in the s with the corresponding letter from stamp.
 *
 * For example, if stamp = "abc" and target = "abcba", then s is "?????" initially. In one turn you can:
 * place stamp at index 0 of s to obtain "abc??",
 * place stamp at index 1 of s to obtain "?abc?", or
 * place stamp at index 2 of s to obtain "??abc".
 * Note that stamp must be fully contained in the boundaries of s in order to stamp
 * (i.e., you cannot place stamp at index 3 of s).
 * We want to convert s to target using at most 10 * target.length turns.
 *
 * Return an array of the index of the left-most letter being stamped at each turn.
 * If we cannot obtain target from s within 10 * target.length turns, return an empty array.
 */

public class StampingTheSequence {

    public int[] movesToStamp(String stamp, String target) {
        if (stamp.equals(target))
            return new int[]{0};

        char[] SC = stamp.toCharArray(), TC = target.toCharArray();
        int slen = SC.length, tlen = TC.length - slen + 1, i, j;
        List<Integer> lans = new ArrayList<>();
        boolean tdiff = true, sdiff;
        while (tdiff)
            for (i = 0, tdiff = false; i < tlen; i++) {
                for (j = 0, sdiff = false; j < slen; j++)
                    if (TC[i + j] == '*') {
                    }
                    else if (TC[i + j] != SC[j])
                        break;
                    else
                        sdiff = true;

                if (j == slen && sdiff) {
                    for (j = i, tdiff = true; j < slen + i; j++)
                        TC[j] = '*';
                    lans.add(0, i);
                }
            }
        for (i = 0; i < TC.length; i++) if (TC[i] != '*') return new int[]{};
        int[] ans = new int[lans.size()];
        for (i = 0; i < lans.size(); i++) ans[i] = lans.get(i);
        return ans;
    }
}
