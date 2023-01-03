package day_160;

/**
 * <a href = "https://leetcode.com/problems/delete-columns-to-make-sorted/">
 * 944. Delete Columns to Make Sorted </a>
 * <p>
 * You are given an array of n strings strs, all of the same length.
 * <p>
 * The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
 * <p>
 * abc<br>
 * bce<br>
 * cae<br>
 * <p>
 * You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
 * <p>
 * Return the number of columns that you will delete.
 */

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int stringLen = strs[0].length();

        int columnsToRemoveCounter = 0;
        for (int charIndex = 0; charIndex < stringLen; charIndex++) {
            for (int strNum = 1; strNum < strs.length; strNum++) {
                if (strs[strNum-1].charAt(charIndex) > strs[strNum].charAt(charIndex)) {
                    columnsToRemoveCounter++;
                    break;
                }
            }
        }
        return columnsToRemoveCounter;
    }
}
