

/**
 * 字符串反转
 */

public class Solution {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Input: " + str);
        String result = reverseString2(str);
        System.out.println("Result: " + result);
    }

    /**
     * 方案一
     *
     * 思路
     * 1. 找到字符串的中点
     * 2. 将中点前一般与后一半的字符逐一交换
     *
     * 不是很简洁
     */
    private static String reverseString(String str) {
        char[] seq = str.toCharArray();
        int len = seq.length;
        int mask = len / 2;

        for (int i = 0; i < mask; i++) {
            char tmp = seq[len - i -1];
            seq[len - i - 1] = seq[i];
            seq[i] = tmp;
        }

        return String.valueOf(seq);
    }

    /**
     * 方案二
     *
     * 利用双指针，逐一对字符进行交换
     */
    private static String reverseString2(String str) {
        char[] seq = str.toCharArray();
        int i = 0;
        int j = seq.length - 1;

        for (;i < j;) {
            char tmp = seq[i];
            seq[i] = seq[j];
            seq[j] = tmp;
            i++;
            j--;
        }

        return String.valueOf(seq);
    }

    /**
     * 方案三
     *
     * 使用内建方法实现
     */
    private static String reverseString3(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    /**
     * 方案四
     *
     * 通过递归实现
     */
    private static String reverseString4(String str) {
        if (str.length == 1) {
            return str;
        } else {
            return reverseString4(str.substring(1)) + str.charAt(0);
        }
    }

    /**
     * 方案五
     *
     * 使用栈实现
     */
    private static String reverseString5(String str) {
        Stack<Character> stringStack = new Stack<>();
        char[] arr = str.toCharArray();

        for (Character c : arr) {
            stringStack.push(c);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stringStack.pop();
        }

        return new String(arr);
    }

    /**
     * 方案六
     *
     * 逆序遍历
     */
    private static String reverseString6(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

}
