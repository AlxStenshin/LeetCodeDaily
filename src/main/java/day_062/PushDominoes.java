package day_062;

/**
 * <a href=https://leetcode.com/problems/push-dominoes/">
 *     838. Push Dominoes</a>
 * <p>
 * There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 * <p>
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * <p>
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * <p>
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
 * <p>
 * You are given a string dominoes representing the initial state where:
 * <p>
 * dominoes[i] = 'L', if the ith domino has been pushed to the left,<p>
 * dominoes[i] = 'R', if the ith domino has been pushed to the right, and<p>
 * dominoes[i] = '.', if the ith domino has not been pushed.<p>
 * Return a string representing the final state.
 */

public class PushDominoes {
    public String pushDominoes(String dominoes) {

        int[] rightToLeftForce = new int[dominoes.length()];
        int[] leftToRightForce = new int[dominoes.length()];

        // Forward = counting 'force' from right to left falling dominoes
        for (int i = 1; i < dominoes.length(); i++) {
            if (dominoes.charAt(i) == '.' && (dominoes.charAt(i - 1) == 'R' || leftToRightForce[i - 1] > 0))
                leftToRightForce[i] = leftToRightForce[i - 1] + 1;
        }

        // Backwards = counting 'force' from left to right falling dominoes
        for (int i = dominoes.length() - 2; i >= 0; i--) {
            if (dominoes.charAt(i) == '.' && (dominoes.charAt(i + 1) == 'L' || rightToLeftForce[i + 1] > 0))
                rightToLeftForce[i] = rightToLeftForce[i + 1] + 1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dominoes.length(); i++) {
            if (leftToRightForce[i] == rightToLeftForce[i])
                result.append(dominoes.charAt(i));
            else if (leftToRightForce[i] == 0 || rightToLeftForce[i] == 0) {
                if (leftToRightForce[i] == 0) {
                    result.append("L");
                } else {
                    result.append("R");
                }
            } else {
                if (leftToRightForce[i] < rightToLeftForce[i]) {
                    result.append("R");
                } else {
                    result.append("L");
                }
            }
        }
        return result.toString();
    }
}
