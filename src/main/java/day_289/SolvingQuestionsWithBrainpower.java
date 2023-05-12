package day_289;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/solving-questions-with-brainpower/" >
 * 2140. Solving Questions With Brainpower </a>
 * <p>
 * You are given a 0-indexed 2D integer array questions where questions[i] = [pointsi, brainpoweri].
 * <p>
 * The array describes the questions of an exam, where you have to process the questions in order (i.e., starting from question 0) and make a decision whether to solve or skip each question. Solving question i will earn you pointsi points but you will be unable to solve each of the next brainpoweri questions. If you skip question i, you get to make the decision on the next question.
 * <p>
 * For example, given questions = [[3, 2], [4, 3], [4, 4], [2, 5]]:<br>
 * If question 0 is solved, you will earn 3 points but you will be unable to solve questions 1 and 2.<br>
 * If instead, question 0 is skipped and question 1 is solved, you will earn 4 points but you will be unable to solve questions 2 and 3.<br>
 * Return the maximum points you can earn for the exam.
 */

public class SolvingQuestionsWithBrainpower {
    public long mostPoints(int[][] questions) {
        int length = questions.length;
        long[] dp = new long[length + 1];
        Arrays.fill(dp, 0);

        for (int i = length - 1; i >= 0; i--) {
            int point = questions[i][0];
            int jump = questions[i][1];

            int nextQuestion = Math.min(length, i + jump + 1);
            dp[i] = Math.max(dp[i + 1], point + dp[nextQuestion]);
        }
        return dp[0];
    }
}
