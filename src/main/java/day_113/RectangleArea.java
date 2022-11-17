package day_113;

/**
 * <a href = "https://leetcode.com/problems/rectangle-area/">
 * 223. Rectangle Area </a>
 * <p>
 * Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.
 * <p>
 * The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).
 * <p>
 * The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).
 */

public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int firstArea = (ay2 - ay1) * (ax2 - ax1);
        int secondArea = (by2 - by1) * (bx2 - bx1);

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);

        return firstArea + secondArea - ((overlapWidth > 0 && overlapHeight > 0) ? overlapWidth * overlapHeight : 0);
    }
}
