
public class Solution {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Input: " + str);
        String result = reverseString2(str);
        System.out.println("Result: " + result);
    }

    // method 1
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

    // method 2
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
}
