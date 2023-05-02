package day_279;

/**
 * <a href = "https://leetcode.com/problems/sign-of-the-product-of-an-array/" >
 * 1822. Sign of the Product of an Array </a>
 * <p>
 * There is a function signFunc(x) that returns:
 * <p>
 * 1 if x is positive.<p>
 * -1 if x is negative.<p>
 * 0 if x is equal to 0.<p>
 * You are given an integer array nums. Let product be the product of all values in the array nums.<p>
 * <p>
 * Return signFunc(product).
 */

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int negativeNumbersCount = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negativeNumbersCount++;
            }
        }

        return negativeNumbersCount % 2 == 0 ? 1 : -1;
    }
}
