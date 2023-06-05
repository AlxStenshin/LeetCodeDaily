package day_313;

/**
 * <a href = "https://leetcode.com/problems/check-if-it-is-a-straight-line/description/ >
 * 1232. Check If It Is a Straight Line </a>
 * <p>
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
 */


public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2)
            return true;

        int deltaX = coordinates[0][0] - coordinates[1][0];
        int deltaY = coordinates[0][1] - coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            if (deltaY * (coordinates[i][0] -coordinates[0][0]) != deltaX * (coordinates[i][1] - coordinates[0][1]))
                return false;
        }
        return true;
    }
}
