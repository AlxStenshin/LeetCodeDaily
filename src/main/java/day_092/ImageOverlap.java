package day_092;
/**
 * <a href = "https://leetcode.com/problems/image-overlap/solution/">
 * 523. Continuous Subarray Sum </a>
 * <p>
 * You are given two images, img1 and img2, represented as binary, square matrices of size n x n. A binary matrix has only 0s and 1s as values.
 * <p>
 * We translate one image however we choose by sliding all the 1 bits left, right, up, and/or down any number of units. We then place it on top of the other image. We can then calculate the overlap by counting the number of positions that have a 1 in both images.
 * <p>
 * Note also that a translation does not include any kind of rotation. Any 1 bits that are translated outside of the matrix borders are erased.
 * <p>
 * Return the largest possible overlap.
 */

public class ImageOverlap {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxOverlaps = 0;

        for (int yShift = 0; yShift < img1.length; ++yShift) {
            for (int xShift = 0; xShift < img1.length; ++xShift) {
                maxOverlaps = Math.max(maxOverlaps, shiftAndCountOverlaps(xShift, yShift, img1, img2));
                maxOverlaps = Math.max(maxOverlaps, shiftAndCountOverlaps(xShift, yShift, img2, img1));
            }
        }
        return maxOverlaps;
    }

    private int shiftAndCountOverlaps(int xShift, int yShift, int[][] img1, int[][] img2) {
        int leftShifts = 0;
        int rightShifts = 0;
        int rRow = 0;

        for (int mRow = yShift; mRow < img1.length; ++mRow) {
            int rCol = 0;
            for (int mCol = xShift; mCol < img1.length; ++mCol) {
                if (img1[mRow][mCol] == 1 && img1[mRow][mCol] == img2[rRow][rCol])
                    leftShifts += 1;
                if (img1[mRow][rCol] == 1 && img1[mRow][rCol] == img2[rRow][mCol])
                    rightShifts += 1;
                rCol += 1;
            }
            rRow += 1;
        }
        return Math.max(leftShifts, rightShifts);
    }

}
