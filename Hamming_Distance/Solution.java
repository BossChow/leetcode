
/**
 * The Hamming distance between two integers is the number of
 * positions at which the corresponding bits are different.
 *
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *
 */

public class Solution {
    public static void main(String[] args) {
        int testValue_x = 1;
        int testValue_y = 4;

        System.out.println("Test Value: " + String.valueOf(testValue_x) + ", " + String.valueOf(testValue_y));

        System.out.println("Result: " + String.valueOf(hammingDistance(testValue_x, testValue_y)));
    }

    public static int hammingDistance(int x, int y) {
        //The java.lang.Integer.bitCount() method returns the number
        //of one-bits in the two's complement binary representation of the specified int value i.
        return Integer.bitCount(x ^ y);
    }
}
