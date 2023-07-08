package day_345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeTheConfusionOfAnExamTest {

    @Test
    void shouldReturnThree() {
        String answerKey = "TFFT";
        int k = 1;
        assertEquals(3, new MaximizeTheConfusionOfAnExam().maxConsecutiveAnswers(answerKey, k));
    }

    @Test
    void shouldReturnFour() {
        String answerKey = "TTFF";
        int k = 2;
        assertEquals(4, new MaximizeTheConfusionOfAnExam().maxConsecutiveAnswers(answerKey, k));
    }

    @Test
    void shouldReturnFive() {
        String answerKey = "TTFTTFTT";
        int k = 1;
        assertEquals(5, new MaximizeTheConfusionOfAnExam().maxConsecutiveAnswers(answerKey, k));
    }

}