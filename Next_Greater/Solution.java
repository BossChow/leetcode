import java.util.*;

/**
 *
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * 
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * 
 * https://leetcode.com/problems/next-greater-element-i/?tab=Description
 *
 */


public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] findNums = {2, 4};

        int[] result = getNextGreater(findNums, nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] getNextGreater(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int num : nums) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        for (int i = 0; i< findNums.length; i++) {
            findNums[i] = map.getOrDefault(findNums[i], -1);
        }

        return findNums;
    }
}
