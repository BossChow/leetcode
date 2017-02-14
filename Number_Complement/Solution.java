
/**
 *
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 *
 * https://leetcode.com/problems/number-complement/?tab=Description
 *
 */

public class Solution {
	public static void main(String[] args) {
		int testValue = 5;
		int result = findComplement(testValue);
        System.out.println(result + " : " + Integer.toBinaryString(result));
	}

    private static int findComplement(int num) {

        System.out.println("Input Num: " + num + " : " + Integer.toBinaryString(num));
        int mask = Integer.highestOneBit(num);
        System.out.println(mask + " : " + Integer.toBinaryString(mask));
        mask = mask << 1;
        System.out.println(mask + " : " + Integer.toBinaryString(mask));
        mask = mask - 1;
        System.out.println(mask + " : " + Integer.toBinaryString(mask));
        num = ~num;
        System.out.println(num + " : " + Integer.toBinaryString(num));
        int result = num & mask;

        return result;
    }

}
