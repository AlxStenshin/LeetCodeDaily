package day_011;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 1220. Count Vowels Permutation
 * https://leetcode.com/problems/count-vowels-permutation/
 *
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 *
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 */

public class CountVowelsPermutation {

    int MOD=1000000007;

    public int countVowelPermutation(int n) {
        HashMap<Character, ArrayList<Character>> map = new HashMap<>();

        ArrayList<Character> a = new ArrayList<>(); // a can be added only if last char is e, i, u
        a.add('e');
        a.add('i');
        a.add('u');
        map.put('a', a);

        ArrayList<Character> E = new ArrayList<>(); // E can be added only if last char is a, i
        E.add('a');
        E.add('i');
        map.put('e', E);

        ArrayList<Character> i = new ArrayList<>(); // i can be added only if last char is e, o
        i.add('e');
        i.add('o');
        map.put('i', i);

        ArrayList<Character> o = new ArrayList<>(); // o can be added only if last char is i
        o.add('i');
        map.put('o', o);

        ArrayList<Character> u = new ArrayList<>(); // u can be added only if last char is o, i
        u.add('o');
        u.add('i');
        map.put('u', u);

        long[][] dp = new long[26][n];
        dp['a' - 'a'][0] = 1;
        dp['e' - 'a'][0] = 1;
        dp['i' - 'a'][0] = 1;
        dp['o' - 'a'][0] = 1;
        dp['u' - 'a'][0] = 1;

        for (int itr = 1; itr < n; itr++) {
            for (Map.Entry<Character, ArrayList<Character>> e : map.entrySet()) {
                ArrayList<Character> al = e.getValue();
                for (char ch : al) {
                    int x = e.getKey() - 'a';
                    int y = ch - 'a';
                    dp[e.getKey() - 'a'][itr] = dp[e.getKey() - 'a'][itr] + dp[ch - 'a'][itr - 1] % MOD;
                }
            }
        }

        long res = 0;

        for (int itr = 0; itr < 26; itr++) {
            res = dp[itr][n - 1] + res % MOD;
        }

        return (int) res % MOD;
    }
}
