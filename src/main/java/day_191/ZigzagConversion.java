package day_191;

/**
 * <a href = "https://leetcode.com/problems/zigzag-conversion/">
 * 6. Zigzag Conversion </a>
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N<br>
 * A P L S I I G<br>
 * Y   I   R<p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows
 */

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder result = new StringBuilder();
        int size = s.length();
        int columnsSpacing = 2 * (numRows - 1);
        int diagonalDiff;
        int index;
        int secondIndex;

        for (int i = 0; i < numRows; i++) {
            index = i;
            while (index < size) {
                result.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = columnsSpacing - 2 * i;
                    secondIndex = index + diagonalDiff;

                    if (secondIndex < size) {
                        result.append(s.charAt(secondIndex));
                    }
                }
                index += columnsSpacing;
            }
        }

        return result.toString();
    }
}
