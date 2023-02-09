package day_197;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/naming-a-company/" >
 * 2306. Naming a Company </a>
 * <p>
 * You are given an array of strings ideas that represents a list of names to be used in the process of naming a company. The process of naming a company is as follows:
 * <p>
 * Choose 2 distinct names from ideas, call them ideaA and ideaB.<br>
 * Swap the first letters of ideaA and ideaB with each other.<br>
 * If both of the new names are not found in the original ideas, then the name ideaA ideaB (the concatenation of ideaA and ideaB, separated by a space) is a valid company name.
 * Otherwise, it is not a valid name.
 * <p>
 * Return the number of distinct valid names for the company.
 */

public class NamingACompany {
    public long distinctNames(String[] ideas) {
        List<String>[] arr = new ArrayList[26];
        long disName = 0;

        for(int i = 0; i < 26; i++)
            arr[i] = new ArrayList<>();

        for(String s : ideas)
            arr[s.charAt(0) - 'a'].add(s.substring(1));

        for(int i = 0; i < 25; i++) {
            for(int j = i + 1; j < 26; j++) {
                if (arr[i].size() != 0 && arr[j].size() != 0) {
                    Set<String> set = new HashSet<>();

                    set.addAll(arr[i]);
                    set.addAll(arr[j]);
                    disName += (long) (arr[i].size() - set.size()) * (arr[j].size() - set.size());
                }
            }
        }

        return disName * 2;
    }

}
