import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{3, 4, -1, 1};
        partition(input);
        System.out.println(Arrays.toString(input));
        //int result = findMissingPositive(input);
    }

    private static int findMissingPositive(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[nums[i] - 1] = nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                return i + 1;
            }
        }

        return -1;
    }

    private static int partition(int[] nums) {
        int n = nums.length;
        int q = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                q++;
                swap(nums, q, i);
            }
        }

        return q;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }
}
