package day_03;

public class PlusOne {
    public int[] plusOne_Shortened(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOne(int[] digits) {
        boolean overflow = false;
        boolean increased = false;

        for (int i = digits.length - 1; i >= 0; i--) {

            int newVal = digits[i];

            if (!increased) {
                newVal++;
                increased = true;
            }

            if (overflow) {
                newVal++;
                overflow = false;
            }

            if (newVal > 9) {
                overflow = true;
                newVal = 0;
            }

            digits[i] = newVal;

            if (!overflow)
                return digits;
        }

        if (overflow) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(result, 1, digits, 0, digits.length);
            return result;
        } else return digits;
    }
}
