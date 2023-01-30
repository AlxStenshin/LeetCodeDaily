package day_187;

public class NthTribonacciNumber {

/**
 * <a href = "https://leetcode.com/problems/n-th-tribonacci-number/">
 * 1137. N-th Tribonacci Number </a>
 * <p>
 * The Tribonacci sequence Tn is defined as follows:
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * <p>
 * Given n, return the value of Tn.
 */
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int[] tribonacci = new int[n + 1];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        return tribonacci[n];
    }
}
