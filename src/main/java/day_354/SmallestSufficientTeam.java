package day_354;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/smallest-sufficient-team/" >
 * 1125. Smallest Sufficient Team </a>
 * <p>
 * In a project, you have a list of required skills req_skills, and a list of people. The ith person people[i] contains a list of skills that the person has.
 * <p>
 * Consider a sufficient team: a set of people such that for every required skill in req_skills, there is at least one person in the team who has that skill. We can represent these teams by the index of each person.
 * <p>
 * For example, team = [0, 1, 3] represents the people with skills people[0], people[1], and people[3].
 * Return any sufficient team of the smallest possible size, represented by the index of each person. You may return the answer in any order.
 * <p>
 * It is guaranteed an answer exists.
 */

public class SmallestSufficientTeam {
    int[][] dp;
    boolean[][] choice;
    int req_mask, m;

    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people_skills) {
        int n = req_skills.length;
        m = people_skills.size();

        HashMap<String, Integer> skills = new HashMap<>();
        for (int i = 0; i < n; i++) {
            skills.put(req_skills[i], i);
        }

        List<Integer> people = new ArrayList<>();
        for (List<String> v : people_skills) {
            int h = 0;
            for (String skill : v)
                h |= 1 << skills.get(skill);
            people.add(h);
        }

        req_mask = (1 << n) - 1;
        dp = new int[1 << n][m];
        choice = new boolean[1 << n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        solve(people, 0, 0);

        List<Integer> ans = new ArrayList<>();
        int mask = 0;
        for (int i = 0; i < m; i++) {
            if (choice[mask][i]) {
                ans.add(i);
                mask |= people.get(i);
            }
            if (mask == req_mask)
                break;
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            result[i] = ans.get(i);

        return result;
    }

    public int solve(List<Integer> people, int i, int mask) {
        if (mask == req_mask)
            return 0;
        if (i == m)
            return 10000;
        if (dp[mask][i] != -1)
            return dp[mask][i];
        int ans1 = solve(people, i + 1, mask | people.get(i)) + 1;
        int ans2 = solve(people, i + 1, mask);
        if (ans1 < ans2)
            choice[mask][i] = true;
        return dp[mask][i] = Math.min(ans1, ans2);
    }
}
