import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2, 2, 3};
        int result = singleNumber_2(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + result);
    }

    /**
     * 通过XOR实现
     */
    private static int singleNumber_1(int[] nums) {
         int result = 0;
         for (int i = 0; i < nums.length; i++) {
             result ^= nums[i];
         }

         return result;
    }

    /**
     * 通过HashMap实现
     */
    private static int singleNumber_2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer ele : map.keySet()) {
            if (map.get(ele) == 1) {
                result = ele;
            }
        }

        return result;
    }
}
