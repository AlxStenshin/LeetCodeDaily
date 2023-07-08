package day_345;

/**
 * <a href = "https://leetcode.com/problems/maximize-the-confusion-of-an-exam/" >
 * 2024. Maximize the Confusion of an Exam </a>
 * <p>
 * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).
 * <p>
 * You are given a string answerKey, where answerKey[i] is the original answer to the ith question. In addition, you are given an integer k, the maximum number of times you may perform the following operation:
 * <p>
 * Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
 * Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.
 */

public class MaximizeTheConfusionOfAnExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int countF = 0;
        int countT = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < answerKey.length()) {
            if (answerKey.charAt(j) == 'F') countF++;
            else countT++;
            while (Math.min(countF, countT) > k) {
                if (answerKey.charAt(i) == 'F') countF--;
                else countT--;
                i++;
            }
            ans = Math.max(ans, countF + countT);
            j++;
        }
        return ans;
    }
}
