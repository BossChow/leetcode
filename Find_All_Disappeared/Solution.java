import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findAllDisappeared(input);
        for (Integer num : result) {
            System.out.println(num);
        }
    }

    private static List<Integer> findAllDisappeared(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] > 0) {
                nums[val - 1] = -nums[val -1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
