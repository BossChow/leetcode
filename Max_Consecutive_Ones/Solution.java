import java.util.Arrays;

/**
 * https://leetcode.com/problems/max-consecutive-ones/?tab=Description
 */

public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 1, 0, 1, 1};
        int result = findMaxConsecutiveOnes3(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + result);
    }

    /**
     * 解决方案一
     */
    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int maxHere = 0;

        for (int num : nums) {
            max = getMax(max, maxHere = num == 1 ? maxHere + 1 : 0);
        }

        return max;
    }

    /**
     * 解决方案二
     */
    private static int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int maxHere = 0;

        for (int num : nums) {
            if (1 == num) {
                maxHere++;
            } else {
                max = getMax(max, maxHere);
                maxHere = 0;
            }
        }
        max = getMax(max, maxHere);
        return max;
    }

    /**
     * Interesting Solution
     */
    private static int findMaxConsecutiveOnes3(int[] nums) {
        int max = 0;
        int sum = 0;

        for (int num : nums) {
            sum *= num;
            sum += num;
            max = getMax(sum, max);
        }
        return max;
    }

    /**
     * 返回两个数字中的较大者
     */
    private static int getMax(int a, int b) {
        return (a >= b) ? a : b;
    }
}
