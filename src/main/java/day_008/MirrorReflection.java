package day_008;

/**
 * 858. Mirror Reflection
 * https://leetcode.com/problems/mirror-reflection/
 *
 * There is a special square room with mirrors on each of the four walls. Except for the southwest corner,
 * there are receptors on each of the remaining corners, numbered 0, 1, and 2.
 *
 * The square room has walls of length p and a laser ray from the southwest corner first meets
 * the east wall at a distance q from the 0th receptor.
 *
 * Given the two integers p and q, return the number of the receptor that the ray meets first.
 *
 * The test cases are guaranteed so that the ray will meet a receptor eventually.
 */

public class MirrorReflection {
    public int mirrorReflection(int p, int q) {
        // supposing room "extension" for simplifying laser reflection mechanics
        // extension means linear room side increase, square room -> rectangular room.

        // virtualRoomExtension * roomSideSize = reflectionCount * reflectionDistance
        // e * p = r * q      corner
        // 1 * 2 = 2 * 1 ->     2
        // 1 * 3 = 3 * 1 ->     1
        // 2 * 3 = 3 * 2 ->     0

        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }

        if (p % 2 == 0) return 2;
        else if (q % 2 == 0) return 0;
        else return 1;
    }
}
