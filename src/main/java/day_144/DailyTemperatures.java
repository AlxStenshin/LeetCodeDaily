package day_144;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 * 739. Daily Temperatures </a>
 * <p>
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */

public class DailyTemperatures {

    public int[] dailyTemperaturesOpt(int[] temperatures) {
        int[] warmer = new int[temperatures.length];
        int hottest = 0;

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (temperatures[i] >= hottest) {
                warmer[i] = 0;
                hottest = temperatures[i];
            } else {
                // check neighbour
                int days = 1;
                while (temperatures[i + days] <= temperatures[i]) {
                    days += warmer[i + days];
                }
                warmer[i] = days;
            }
        }
        return warmer;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] answer = new int[size];
        Stack<Integer> indexSeqStack = new Stack<>();

        for (int i = 0; i < size; i++) {
            while (!indexSeqStack.empty() && temperatures[indexSeqStack.peek()] < temperatures[i]) {
                answer[indexSeqStack.peek()] = i - indexSeqStack.pop();
            }
            indexSeqStack.push(i);
        }
        return answer;
    }
}
