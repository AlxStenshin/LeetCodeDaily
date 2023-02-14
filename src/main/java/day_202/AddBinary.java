package day_202;

/**
 * <a href = "https://leetcode.com/problems/add-binary/" >
 * 67. Add Binary </a>
 * <p>
 * Given two binary strings a and b, return their sum as a binary string.
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        final char zero = '0';

        StringBuilder sb = new StringBuilder();

        int sizeA = arrayA.length - 1;
        int sizeB = arrayB.length - 1;
        int summ;
        int inc = 0;

        while (sizeB > -1 || sizeA > -1 || inc != 0) {
            summ = inc;

            if (sizeA > -1) summ += (arrayA[sizeA--] - zero);
            if (sizeB > -1) summ += (arrayB[sizeB--] - zero);

            if (summ > 1) {
                inc = 1;
                summ -= 2;
            } else inc = 0;

            sb.append((char) (summ + zero));
        }
        return sb.reverse().toString();
    }
}
