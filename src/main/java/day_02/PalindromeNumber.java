package day_02;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int rev = 0;
        int original = x;

        while (x != 0) {
            int num = x % 10;
            rev = rev * 10 + num;
            x = x / 10;
        }

        return original == rev;
    }
}
