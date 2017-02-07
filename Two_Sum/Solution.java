import java.util.HashMap;
import java.util.Arrays;

/**
 *
 * Given an array of integers, 
 * return indices of the two numbers such that 
 * they add up to a specific target.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * kian@20170207
 */

public class Solution {

    public static void main(String[] args){
        int[] nums = {3, 2, 1, 5, 7};
        int target = 10;

        int[] result = twoSum(nums, target);

        System.out.println("Input Num List: " + Arrays.toString(nums));
        System.out.println("Target Num : " + String.valueOf(target));
        System.out.println("Result: "  + Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                result[0] = hm.get(nums[i]);
                result[1] = i;
                return result;
            }
            hm.put(target - nums[i], i);
        }

        return result;
    }
}
